package employeeaverage;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author SamJay
 */
public class EmployeeAverage {
    
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double a=0;
        int n=in.nextInt();
        int count=0;
        for(int i=0;i<n;i++){
            double rating =in.nextInt();
                if(rating >=90 && rating<=100){
                   a=a+rating;
                   count++;   
            } 
        }
         double average=a/count;
         DecimalFormat format=new DecimalFormat("#.00");
 
         System.out.println("average :"+format.format(average));
      
         System.out.print("number of employees :"+count);
        
        
        
    }

}
