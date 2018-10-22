
package exeptionspractice;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author SamJay
 */
public class ExeptionsPractice {
    
    public static void InputMismatch(){
        Scanner in=new Scanner(System.in);
        System.out.print("enter a number: ");
        try{
        int a=in.nextInt();
        System.out.println(a);
        }catch(InputMismatchException e){
            System.out.println("you can only enter a number");
        }
        //do this no matter what
        finally{
            System.out.println("Out of the try");
        }
    }
    
    public static void OutOfBoundsExeption(){
         try{
       int[] intArray=new int[10];
       System.out.println(intArray[10]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("such an index does not exist in the array");
        }
        //do this no matter what
        finally{
            System.out.println("Out of the try");
        }
    
    }
    
    public static void Mismatch(){
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        try{
        System.out.println(Integer.parseInt(s));
        }catch(NumberFormatException e){
            System.out.println("Bad String");
        }
    }

    public static void main(String[] args) {
//       InputMismatch();
//       OutOfBoundsExeption();
         Mismatch();
        
        
    }
    
}
