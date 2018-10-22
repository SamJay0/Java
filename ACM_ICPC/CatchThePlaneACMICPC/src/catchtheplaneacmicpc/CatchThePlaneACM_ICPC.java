package catchtheplaneacmicpc;

import java.util.Scanner;

/**
 * @author SamJay
 */
public class CatchThePlaneACM_ICPC {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int m=in.nextInt();//number of buses    (1<=m<=10^6)
        int n=in.nextInt();//number of bus stations in the city     (2<=n<=10^6)
        int k=in.nextInt();//time by which you must arrive at the airport    (1<=k<=10^18)
        for(int i=0;i<m;i++){
            int a=in.nextInt();//a>=0  start
            int b=in.nextInt();//b<n,   a!=b    destination
            
            int s=in.nextInt();//s>=0,  depature from a
            int t=in.nextInt();//s<t<=k  arrival in station b
            //probability of arival in time
            double p=in.nextDouble();//  (0<=p<=1) at most 10 digits from the decimal point                            
        }
        int[] S=new int[n];
       
    }

}
