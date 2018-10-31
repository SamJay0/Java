package tictactoeapplication;

import java.util.Scanner;

/**
 * @author SamJay
 */
public class TicTacToeApplication {

    public static void main(String[] args) {
        //getting input
        Scanner in = new Scanner(System.in);
        boolean doYouWantToPlay = true;
        while (doYouWantToPlay) {
            //setting up input and AI
            System.out.println("Welcome to the TIC TAC TOE!  You are about to go against"
                    + " the Master of The Game .Are you ready?? I hope so \n BUT FIRST ,You"
                    + " must pick what character you want to be and which character I will be");
            System.out.print("Enter a single character that will represent you on the board: ");
            char playerToken = in.next().charAt(0);
            System.out.print("Enter a single charcter that will represent your opponrnt on the board: ");
            char opponentToken = in.next().charAt(0);
            TicTacToe game = new TicTacToe(playerToken, opponentToken);
            AI ai = new AI();
            //set up game
            TicTacToe.printIndexBoard();
            System.out.println();
            //lets play
            while (game.gameOver().equals("notOver")) {
                if (game.currentMarker == game.userMarker) {
                    System.out.print("It's your turn. Enter a spot for your token: ");
                    int spot = in.nextInt();
                    while (!game.playTurn(spot)) {
                        System.out.print("try again " + spot + " is invalid this spot is already taken"
                                + " or it is out of range: ");
                        spot = in.nextInt();
                    }
                    System.out.println("You picked " + spot + "!");
                } else {
                    //AI turn
                    System.out.println("It's my turn !");
                    int aiSport = ai.pickSpot(game);
                    game.playTurn(aiSport);
                    System.out.println("I picked " + aiSport + " !");
                }
                //printout new board
                System.out.println();
                game.printBoard();
            }
            System.out.println(game.gameOver());
            System.out.print("Do you want to play again? Enter Y if you do."
                    + " Enter anything else if you are tired of me.: ");
            char response = in.next().charAt(0);
            doYouWantToPlay = (response == 'Y');
            System.out.println();
            System.out.println();

        }
    }

}
