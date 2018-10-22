package acmpalindrome;

import java.util.Scanner;

/**
 * @author SamJay
 */
public class AcmPalindrome {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 0;
        while (count < 20) {
            String word = scan.nextLine();
            if (word.equals("-1")) {
                return;
            }
            for (int i = 0; i < word.length(); i++) {
                for (int j = word.length() - 1; j >= 0; j--) {
                    if (word.charAt(i) != word.charAt(j)) {
                        System.out.println("Not a palindrome");
                        return;
                    }
                }
            }
            System.out.println("Palindrome");
            count ++;
        }

    }
}
