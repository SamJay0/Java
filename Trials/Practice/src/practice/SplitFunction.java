
package practice;

import java.util.Arrays;

/**
 * @author samjay
 */
public class SplitFunction {
    public static void main(String [] args){
        String str="JaySamWekesa";
        int length = 3;
String[] parts = str.split("(?<=\\G.{" + length + "})");
System.out.println(Arrays.toString(parts));
    }

}
