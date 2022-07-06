package com.java.exceptionhandel.Unchacked;
import java.lang.reflect.Array;
import java.util.Arrays;
public class ArrayStorExcption extends Throwable {
    public static void main(String [] args){
        int ar1[] = new int[5];
        int as = 0;
        for (int i = 0; i<ar1.length; i++){
            ar1[i] = as;
            as++;
        }
        try{
            ar1[4] = 17;
            //System.out.println(ar1[11]);
            System.out.println(ar1[4]);
        }
        catch (Exception e){
            System.out.println("This is an error for a reason " + e.getMessage());
        }


    }
}
