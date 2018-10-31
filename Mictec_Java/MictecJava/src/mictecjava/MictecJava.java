package mictecjava;

import java.util.Scanner;

/**
 * @author SamJay
 */
public class MictecJava {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = in.nextInt();
        System.out.println("You entered " + a);
        in.nextLine();
        System.out.print("enter a word: ");
        String s = in.nextLine();
        System.out.println("You entered " + s);
        System.out.print("enter a decimal number : ");
        double myDouble=in.nextDouble();
        System.out.println("You entered " + myDouble);

    }

}
