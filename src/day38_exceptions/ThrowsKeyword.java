package day38_exceptions;

import java.io.FileInputStream;

public class ThrowsKeyword {

    public static void main(String[] args) throws InterruptedException {

        /*
        System.out.println("Program1 started");

        // System.out.println(100/0);

        try {
            Thread.sleep(5000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Program1 ended");
        */

        System.out.println("Program1 started");
        Thread.sleep(5000);
        System.out.println("Program1 ended");

        System.out.println("------------------------------------------------------------------------");

        System.out.println("Program2 started");
        Thread.sleep(5000);
        System.out.println("Program2 ended");

        System.out.println("-----------------------------------------------------------------------------");

       // FileInputStream file = new FileInputStream("");
        Thread.sleep(5000);
    }



}
