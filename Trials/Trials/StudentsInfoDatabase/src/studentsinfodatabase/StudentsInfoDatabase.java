package studentsinfodatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 * @author SamJay
 */
public class StudentsInfoDatabase {
    String name;
    String Reg;
    String Course;
    String Dpt;
    int ID;

    public void InsertData(String querry) {
        Connection conObj = null;
        Statement statObj = null;

        try {
            conObj = DriverManager.getConnection("jdbc:derby://localhost:1527/Products", "SamJay0", "samjay254");
            statObj = conObj.createStatement();
            statObj.executeUpdate(querry);

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    public void data(){
        Scanner in =new Scanner(System.in);
        System.out.print("Enter name: ");
        this.name=in.nextLine();
        System.out.print("Enter Reg: ");
        this.Reg=in.nextLine();
        System.out.print("Enter Course: ");
        this.Course=in.nextLine();
        System.out.print("Enter Department: ");
        this.Dpt=in.nextLine();   
    }
    public void getData() {
        Connection conObj = null;
        Statement statObj = null;
        ResultSet rsltObj = null;

        String querry = "Select * From SamJay0.Students";
        try {
            conObj = DriverManager.getConnection("jdbc:derby://localhost:1527/Students", "SamJay0", "samjay254");
            statObj = conObj.createStatement();
            rsltObj = statObj.executeQuery(querry);
            //print out Id,Name,Reg_No,Course,Department
            System.out.println("___________________________________________________"
                    + "\n  ID\tName\tRegNo.\tCourse\tDepartment"
                    + "\n---------------------------------------------------");
            while (rsltObj.next()) {
                System.out.println("  " + rsltObj.getInt("ID") + "\t" + rsltObj.getString("NAME")
                        + "\t" + rsltObj.getString("REG_NO") + "\t" + rsltObj.getString("COURSE") + ""
                        + "\t" + rsltObj.getString("DEPARTMENT"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        StudentsInfoDatabase info = new StudentsInfoDatabase();
//        info.InsertData("Insert into Students (ID,NAME,REG_NO,COURSE,DEPARTMENT)values(8,'sam','9961','MCS','DPT')");
        info.getData();
        info.InsertData("Insert into Products (ID,NAME,DESCRIPTION,PRICE,QUANTITYATHAND,MINORDERQUANTITY)values(10,'cocoa','sweet',20.56,5,2)");

    }

}
