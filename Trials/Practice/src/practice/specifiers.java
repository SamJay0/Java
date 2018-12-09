package practice;

import java.util.Scanner;

/**
 * @author samjay
 */
public class specifiers {

    String action;

    public enum Day {
        MON, TUE, WED, THUR, FRI, SAT, SUN
    }

    public static void main(String[] args) {
//        System.out.println(Day.WED);
//        Scanner in = new Scanner(System.in);
//        do {
//            System.out.print("enter a  number: ");
//            int x = in.nextInt();
////            System.out.println("great");
//            if (x == 7) {
//                return;
//            }
//        } while (in.hasNext());
Scanner input = new Scanner(System.in);
System.out.print("Please enter an integer: ");
while (!input.hasNextInt()) {
input.nextLine( );
System.out.print("Invalid integer; please enter an integer: ");
}
int i = input.nextInt( );
    }

}
