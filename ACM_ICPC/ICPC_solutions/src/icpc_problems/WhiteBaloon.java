package icpc_problems;

import java.util.Scanner;

/**
 * @author SamJay
 */
public class WhiteBaloon {
    public static int F(int n){
        return n;
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        if (in.nextInt() == -1) {
            return;
        }
        int testCases = in.nextInt();
        for (int i = 0; i < testCases; i++) {
            //first line
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            int d = in.nextInt();
            //second line
            int Q = in.nextInt();
            //Q lines
            for (int j = 0; j < Q; j++) {
                //n's
                int n = in.nextInt();
                if(n<0){  
                    System.out.println(0);    
                }
                else if(n==0){
                     System.out.println(1);    
                }
                else{
                    int result=a*F(n-1)+b*F(n-2)+c*F(n-3)+2^d;
                    System.out.println(result);
                    
                }

            }

        }
    }

}
