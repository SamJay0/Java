package positivenumberexception;

import java.util.Scanner;

/**
 * @author SamJay
 */
public class Calculator {

    public static void Pow() {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        if (x > 0 && y > 0) {
            System.out.println(Math.pow(x, y));
        } else {
            System.out.println("Both must be positive");
        }
    }

    // using exceptions
    public static int power(int x, int y) throws PositiveException {
        if (x < 0 || y < 0) {
            throw new PositiveException("Both inputs must be positive integers");
        }
        //cast
        return (int) Math.pow(x, y);
    }
    
    //using the inbuilt exception
    public static int pow(int n, int p) throws IllegalArgumentException{//the illegal argument Exception is inbuilt
        if(n < 0 || p < 0){
            throw new IllegalArgumentException("n and p should be non-negative");
        }
        return (int)Math.pow(n,p);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of sums to calculate: ");
        int t = in.nextInt();
        while (t-- > 0) {

            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            } catch (PositiveException e) {
                System.out.println("Error:" + e.getMessage());
            }
        }
        in.close();
    }

}
