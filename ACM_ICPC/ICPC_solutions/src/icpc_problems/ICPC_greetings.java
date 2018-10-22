package icpc_problems;

import java.util.Scanner;

/**
 * @author SamJay
 */
public class ICPC_greetings {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 0;
        while (count <20) {
            //get record
            String record = scan.nextLine().trim();
            char n = record.charAt(0);
            if (record.equals("-1")) {
                return;
            }
            String nameOfPerson = record.substring(1, record.length()).trim();
            if (nameOfPerson.length() > 30) {
                System.out.println("Name should not have more than 30 characters");

            }
            switch (n) {
                case '0':
                    System.out.println("Bonjour " + nameOfPerson);
                    break;
                case '1':
                    System.out.println("Olá " + nameOfPerson);
                    break;
                default:
                    System.out.println("Hello " + nameOfPerson);
                    break;
            }
            count++;
        }
      

    }

}
