package icpc_problems;

import java.util.Scanner;

/**
 * @author SamJay
 */
public class OrangeBaloon {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        if(in.nextInt()==-1){
            return;
        }
        int testCases=in.nextInt();//testcases
        for(int i=0;i<=testCases;i++){
            //first int-number of std fertilizers to consider
            int x=in.nextInt();
            if(!(x>=2 && x<=4)){
                return;
            }
            for (int j=0;j<x;j++){
                int n_i=in.nextInt();
                int p_i=in.nextInt();
                int k_i=in.nextInt();
            }
            int n=in.nextInt();
            int p=in.nextInt();
            int k=in.nextInt();
            
        }
    }
}
