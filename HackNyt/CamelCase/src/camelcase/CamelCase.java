package camelcase;

import java.util.Scanner;

/**
 * @author SamJay
 */
public class CamelCase {
  
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        int count=1;
        for(int i=0;i<s.length();i++){
            if(Character.isUpperCase(s.charAt(i))){
              count++;  
            }  
        }
        System.out.println(count);
    }

}
