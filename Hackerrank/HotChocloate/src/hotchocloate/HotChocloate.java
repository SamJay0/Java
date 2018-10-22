package hotchocloate;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author SamJay
 */
public class HotChocloate {

    //class variables
    public static final double TOOHOT = 180;
    public static final double TOOCOLD = 160;

    /*create a function to throws Exceptions ...we
    *had to throw exceptions since we are not using 
    *try and catch
     */
    public static void DrinkHotChocolate(double cocoaTemp) throws TooHotException, TooColdException {
        if (cocoaTemp >= TOOHOT) {
            throw new TooHotException();
        } else if (cocoaTemp <= TOOCOLD) {
            throw new TooColdException();
        }
    }

    //Drink function
    public static void Drink(double cocoaTemp) throws InterruptedException {
        boolean wrongTemp = true;
        while (wrongTemp) {
            try {
                DrinkHotChocolate(cocoaTemp);
                System.out.println("That felt good");
                wrongTemp = false;
            } catch (TooHotException e1) {
                System.out.println("Too Hot");
                cocoaTemp = cocoaTemp - 5;
            } catch (TooColdException e2) {
                System.out.println("Too Cold");
                cocoaTemp = cocoaTemp + 5;
            }
            TimeUnit.SECONDS.sleep(1);
        }
        System.out.println("Am done");
    }

    /* had to throw exceptions since we are not using try and catch*/
    public static void main(String[] args) throws TooHotException, TooColdException, InterruptedException {
        Drink(190);
        Scanner in = new Scanner(System.in);
        System.out.println(Math.pow(in.nextInt(), in.nextInt()));
    }

}
