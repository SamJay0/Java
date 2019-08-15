import java.util.Scanner;
public class ReverseOutput{
    private static Scanner input=new Scanner(System.in);
    public static void Test(){
       int x=input.nextInt();
       double y=input.nextDouble();
       input.nextLine();
       String s=input.nextLine(); 

       //print out in reverse order
       System.out.println(s+" "+y+" "+x);
    }
    public static void printReverse(){
        while(input.hasNext()){
            input.nextLine();
            // System.out.print("enter input : ");
        }
    }
    public static void main(String[] args) {
       printReverse();
    }
}