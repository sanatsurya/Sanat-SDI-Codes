package com.java.exceptionhandel.CheckedException;

import java.io.*;

public class FileNfException {
    public static void main(String[]args){
        try {
            //Checked / Compile Time Exception
//            FileReader fr = new FileReader("C:\\Users\\ESC202204JAVA09\\Documents\\SANAT CODES\\SANAT JAVA\\Exception Handelling\\untitled\\src\\com\\java\\exceptionhandel\\CheckedException\\myFile.txt");
            FileReader fm = new FileReader("./myFile.txt");
            System.out.println("This file is found");
        } catch (Exception e) {
            System.out.println("File not found!" + e.getMessage());
            System.out.println(e.getStackTrace());
        }
    }
}
