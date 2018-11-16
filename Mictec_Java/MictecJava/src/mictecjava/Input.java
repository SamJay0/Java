package mictecjava;

import java.util.Scanner;

/**
 * @author SamJay
 */
public class Input {

    public static void main(String[] args) {
        Scanner sam = new Scanner(System.in);
        //prompt user
        System.out.println("Enter a number");
        int a = sam.nextInt();
        if(a%2==0){
            System.out.println("The number you entered is even");
        }
        else{
            System.out.println("The number you entered is odd");
        }
    }

}
