package palindrome;

import java.util.Scanner;

/**
 * @author SamJay
 */
public class Palindrome {

    public static void main(String[] args) {
    Scanner in =new Scanner(System.in);
        String ss=in.nextLine();
        StringBuilder sb=new StringBuilder(ss);
        sb.reverse();
        if(ss.equals(sb.toString())){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }    
    }

}
