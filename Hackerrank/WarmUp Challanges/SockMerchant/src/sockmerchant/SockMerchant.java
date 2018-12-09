package sockmerchant;

import java.util.Scanner;

/**
 * @author samjay
 */
public class SockMerchant {
    
    public static int getPairs(int n,int[] sockColors){
         int count=1;
         int pairs=0;
         for (int i = 0; i < sockColors.length; i++) {
                for(int j=i+1;j<sockColors.length-1;j++){
                    if(sockColors[i]==sockColors[j]){
                        System.out.println("awe");
                        count ++;

                    }
                }
            }
         System.out.println(count);
            //get pairs
            return count/2;
    }

    public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            System.out.println("enter number of socks");
            int numberOfSocks = in.nextInt();
            int sockColors[] = new int[numberOfSocks];
            for (int i = 0; i < sockColors.length; i++) {
                sockColors[i] = in.nextInt();
            }
           
            System.out.println(getPairs(numberOfSocks,sockColors)+" pairs");
       
    }

}
