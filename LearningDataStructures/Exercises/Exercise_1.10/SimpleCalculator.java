/**Write a Java program that can simulate a simple calculator, using the Java console
as the exclusive input and output device. That is, each input to the calculator, be
it a number, like 12.34 or 1034, or an operator, like + or =, can be done on a
separate line. After each such input, you should output to the Java console what
would be displayed on your calculator. */
import java.util.Scanner;
public class SimpleCalculator{
    private static Scanner input=new Scanner(System.in);
    private static double result=0;
    public static void doCalculation(char operation,double mnumber){
        switch(operation){
            case '+':{
                result +=mnumber;
                break;
            }
            case '-':{
                result -=mnumber;
                break;
            }
            case '/':{
                result /=mnumber;
                break;
            }
            case 'x':{
                result *=mnumber;
                break;
            }
            case '=':{
                System.out.println(result);
                break;
            }
            default :{
                System.out.println("invalid input");
            }
        }
    }
    public static void main(String[] args) {
        result=input.nextDouble();
        input.nextLine();
        while(input.hasNext()){
            char oper=input.nextLine().charAt(0);
            //display result if operatio is "="
            if(oper=='='){
                doCalculation(oper, result);
            }
            //exit calculations
            else if(oper=='p'){
                return;
            }
            else{
                double number=input.nextDouble();
                doCalculation(oper, number);
                input.nextLine();
            }
            
        }
        

        
      
   
    }
}