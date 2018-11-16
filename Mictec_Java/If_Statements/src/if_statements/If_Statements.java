package if_statements;

import java.util.Scanner;

/**
 * @author samjay
 */
public class If_Statements {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("enter a number");
            int x = scan.nextInt();
            if (x % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }

        }
    }

}
