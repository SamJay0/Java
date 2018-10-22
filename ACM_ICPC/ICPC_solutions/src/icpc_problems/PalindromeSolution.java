package icpc_problems;

import java.util.Scanner;

/**
 * @author SamJay
 */

public class PalindromeSolution {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        String word=in.nextLine();
        StringBuilder sb=new StringBuilder("");
        sb.append(word);
        sb.reverse();
        if(word.equals(sb.toString())){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
        
    }
}
