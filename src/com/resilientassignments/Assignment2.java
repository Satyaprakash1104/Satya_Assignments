package com.resilientassignments;

import java.util.Scanner;

public class Assignment2 {

    public static void main(String[] args) {

        double x , y , multiplication ,addition ,subtraction ,division;

        Scanner input = new Scanner(System.in);

        System.out.println("first number = ");
        x = input.nextDouble();

        System.out.println("Second number = ");
        y = input.nextDouble();

        multiplication =  x * y;
        division = x / y;
        addition = x + y;
        subtraction = x - y;

        System.out.println("Multiplication = " +multiplication+ "Addition = "+addition+ "Subtraction = "+subtraction+ "Division = "+division);


    }
}
