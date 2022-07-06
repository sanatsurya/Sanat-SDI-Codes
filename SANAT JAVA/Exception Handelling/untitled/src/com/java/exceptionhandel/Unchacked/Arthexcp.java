package com.java.exceptionhandel.Unchacked;

public class Arthexcp {
    public static void main (String [] args){
        int a = 50;
        int b = 70;
        try{
            int c = a*b/0;
            System.out.println(c);
        }
        catch (ArithmeticException e){
            System.out.println("There was an error in your input" + e.getMessage());
        }
        System.out.println("program end");
    }
}
