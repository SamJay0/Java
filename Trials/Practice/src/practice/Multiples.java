package practice;

/**
 * @author samjay
 */
public class Multiples {

    //Write a short Java method that takes an integer n and returns the sum of all
    //positive integers less than or equal to n.
    public static int sumOfIntBelowN(int n) {
        if (n < 1) {
            return 0;
        }
        return n + sumOfIntBelowN(n - 1);
    }

    // Write a short Java method that takes an integer n and returns the sum of all the
    //odd positive integers less than or equal to n.
    public static int sumOfOddIntBelowN(int n) {
        int sum = 0;
        if (n % 2 == 1) {
            if (n < 1) {
                sum += 1;
            }
            sum += n + sumOfOddIntBelowN(n - 1);
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOfIntBelowN(5));
        System.out.println(sumOfOddIntBelowN(11));

    }

}
