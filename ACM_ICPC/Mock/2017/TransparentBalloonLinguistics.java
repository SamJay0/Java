import java.util.Scanner;
public class TransparentBalloonLinguistics{
  public static void main(String [] args){
    Scanner in=new Scanner(System.in);
    int count=0;
    String output="\n";
    while(count<20){
      String s=in.nextLine();
      char firstValue=s.charAt(0);
      String nameOfPerson=s.substring(2);
      if (s.equals("-1")) {
        break;
      }
      if(firstValue=='0'){
        output +="Bonjour "+nameOfPerson+"\n";
      }
      else if(firstValue=='1'){
        output +="Ola "+nameOfPerson+"\n";
      }
      else{
        output +="Hello "+nameOfPerson+"\n";
      }

      count++;
    }
    System.out.println(output);
  }
}
