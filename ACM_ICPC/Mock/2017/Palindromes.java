import java.util.Scanner;
public class Palindromes{
  public static void main(String [] args){
    Scanner in = new Scanner(System.in);
    int count=0;
    String output="\n";
    while(count<20){
      String str=in.nextLine();
      if(str.equals("-1")){
        break;
      }
      StringBuilder s=new StringBuilder(str);
      s.reverse();
      if(str.equals(s.toString())){
        output += "Palindrome\n";
      }
      else{
        output += "Not a Palindrome\n";
      }

      count++;
    }
    System.out.println(output);

  }

}
