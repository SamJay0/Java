package tictactoeapplication;

/**
 * @author SamJay
 */
public class TicTacToe {

    protected char[] board;
    protected char userMarker;
    protected char aiMarker;
    protected char winner;
    protected char currentMarker;
    
    //default constructor
    public TicTacToe(){
    }
    
    //constructor
    public TicTacToe(char playerToken,char aiMarker){
         this.userMarker=playerToken;
         this.aiMarker=aiMarker;
         this.winner='-';
         this.board=setBoard();
    }
    public static char[] setBoard(){
        char [] board=new char[9];
        for(int i=0;i<board.length;i++){
            board[i]='-';
        }
        return board;
    }
    public boolean playTurn(int spot){
        boolean isValid=withinRange(spot) && !isSpotTaken(spot);
        if(isValid){
            board[spot-1]=currentMarker;
            currentMarker=(currentMarker==userMarker) ? aiMarker : userMarker;    
        }
        return isValid;
    }
  
   //check if spot is within range
    public boolean withinRange(int spot){
        return spot >0 && spot<board.length+1;
    }
    //check if spot is taken
     public boolean isSpotTaken(int spot){
        return board[spot-1] !='-';
    }
     public void printBoard(){
         System.out.println();
         for(int i=0;i<board.length;i++){
             if(i%3==0 && i!=0){
                 System.out.println();
                 System.out.println("______________");
             }
             System.out.print(" | "+board[i]);
         }
         System.out.println();
         
     }
 
    

}
