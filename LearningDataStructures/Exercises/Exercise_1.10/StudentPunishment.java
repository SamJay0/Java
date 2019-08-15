/**A common punishment for school children is to write out a sentence multiple
times. Write a Java stand-alone program that will write out the following sen-
tence one hundred times: “I will never spam my friends again.” Your program
should number each of the sentences and it should make eight different random-
looking typos. */
import java.util.Random;

import javax.swing.JOptionPane;
public class StudentPunishment{

    public static void repeatSentence(){
        int count=1;
        String s="I will never spam my friends again.";
        while (count <=100){
            System.out.println(count+": "+s);
            count ++;
        }
    }
    public static void randomGenerator(){
        Random ran=new Random();
        for(int i=0;i<100;i++){
            System.out.print(Math.abs(ran.nextInt(10)+1)+"  ");
        }
        
    }
    public static void main(String[] args) {
     repeatSentence();
     JOptionPane.showMessageDialog(null, "incomplete");
    }
}