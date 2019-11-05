/*                  ___________________
                       @JayDevelopers'
                    ----------------------------------  */
package inventory.datastructures;

import java.util.Random;

/**
 * @author samjay
 */
public class RandomNumberGenerator {

    int minimumValue;
    int maximumValue;

    //defaultConstructor
    public RandomNumberGenerator() {

    }

    /*
    *setters
     */
    public int setMinValue() {
        Random rand = new Random();
        return Math.abs((rand.nextInt() % 5)) + 1;
    }

    public int setMaxValue() {
        Random rand = new Random();
        return Math.abs(rand.nextInt() % 11);
    }

    /*
    *getters
     */
    
    public int getMinValue() {
        return minimumValue;
    }

    public int getMaxValue() {
        return maximumValue;
    }
}
