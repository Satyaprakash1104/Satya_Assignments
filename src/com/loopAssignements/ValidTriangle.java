package com.loopAssignements;

import java.util.Scanner;

public class ValidTriangle {

    public static void main(String [] args){

        double a , b , c ;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first angle : ");
        a = input.nextDouble();
        System.out.println("Enter second angle : ");
        b = input.nextDouble();
        System.out.println("Enter third angle : ");
        c = input.nextDouble();

        if ( a + b + c == 180) {
            System.out.println(" it is a valid triangle.");

        }
        else{
            System.out.println(" It is not a valid triangle. ");
        }

    }
}
