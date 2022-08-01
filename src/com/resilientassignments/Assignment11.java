package com.resilientassignments;

import java.util.Scanner;

public class Assignment11 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number = ");
        int p = input.nextInt();

        double result = Math.sqrt(p);
        System.out.println("Square root of "+p+ " is " +result);

    }
}
