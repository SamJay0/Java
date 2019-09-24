package com.example.textfiles;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadingFromFiles {
    public static void main(String[] args) throws IOException {

//        //display text from file
//        File file = new File("readme.txt");
//        if(file.exists()){
//            Scanner inputFile = new Scanner(file);
//            while (inputFile.hasNext()){
//                System.out.println(inputFile.nextLine());
//            }
//            //close file.
//            inputFile.close();
//        }
//        else{
//            System.out.println("file does not exist");
//        }

        //get average from data in file
        int sum=0;
        double average;
        File dataFile = new File("marks.txt");
        if(dataFile.exists()){
            Scanner data = new Scanner(dataFile);
            int count = 0;
            while (data.hasNext()){
                sum +=data.nextInt();
                count ++;

            }
            average = sum/(double)count;
            JOptionPane.showMessageDialog(null,"average = "+average);
            //close file.
            data.close();
        }
        else{
            System.out.println("file does not exist");
        }
    }
}
