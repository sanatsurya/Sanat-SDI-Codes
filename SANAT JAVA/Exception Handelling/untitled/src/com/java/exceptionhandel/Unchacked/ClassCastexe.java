package com.java.exceptionhandel.Unchacked;

import org.w3c.dom.ls.LSOutput;

public class ClassCastexe {
    public static void main(String[] args) {
        try{
//            Object ob = new Object();
//            String s = (String) ob;
//            System.out.println(s);
            Object i = new Object();
            Integer s = (Integer) i;
        }
        catch (Exception e){
            System.out.println("The error is for" + e.getMessage());
            System.out.println(e.getStackTrace());
        }



    }
}
