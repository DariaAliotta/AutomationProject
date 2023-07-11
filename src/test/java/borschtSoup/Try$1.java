package borschtSoup;

import java.util.Scanner;

public class Try$1 {
    public static void main (String[]args) {

        // OOP --> object o. program

        // Scanner class    Object Name       =    new key      Constructor from Scanner class
           Scanner          scan              =    new          Scanner(System.in);


        System.out.println ("Insert your password, please");
//        int nbr = scan.nextInt();
        String nbr = scan.nextLine();
        System.err.println("Welcome Back! " + nbr);


    }
}
