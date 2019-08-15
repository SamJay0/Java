import java.util.Scanner;
public class EnumUse{
    public enum Day{MON,TUE,WED,THUR,FRI,SAT,SUN};
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Day day=MON;
        System.out.print("enter day: ");
        String s=sc.next();
        switch(day){
            case MON:{
                System.out.println("its a monday");
                break;
            }
            case TUE:{
                System.out.println("The week just began");
                break;
            }
            case WED:{
                System.out.println("And here comes Tuyesday");
                break;
            }
            case THUR:{
                System.out.println("Thursday");
                break;
            }
            case FRI:{
                System.out.println("Friday");
                break;
            }
            case SAT:{
                System.out.println("Saturday");
                break;
            }
            case SUN:{
                System.out.println("Sunday");
                break;
            }
            default :{
                System.out.println("");
                break;
            }
        }

    }
}