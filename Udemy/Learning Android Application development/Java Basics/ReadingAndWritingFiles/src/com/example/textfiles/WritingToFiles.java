package com.example.textfiles;

import java.io.IOException;
import java.io.PrintWriter;

public class WritingToFiles {
    public static void main(String[] args) throws IOException {
        PrintWriter outputFile = new PrintWriter("readme.txt");
        outputFile.println("This is Line 1");
        outputFile.println("This is Line 2");
        outputFile.println("This is Line 3");
        outputFile.close();
    }
}
