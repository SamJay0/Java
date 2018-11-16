
package if_statements;

import java.util.Scanner;

/**
 * @author samjay
 */
public class Login {
    public static void main(String []args){
        String password="samjay";
        Scanner scan=new Scanner(System.in);
        System.out.println("enter password");
        String pass=scan.nextLine();
        if(pass.equalsIgnoreCase(password)){
            System.out.println("Login successful");
        }else{
            System.out.println("login failed");
        }
    }
}
