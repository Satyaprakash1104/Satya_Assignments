package com.resilientassignments;

import java.util.Scanner;

public class Assignment16 {

    public static void main(String[] args) {

        double p , r , t ;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value of P = ");
        p = input.nextDouble();

        System.out.println("Enter the value of R = ");
        r = input.nextDouble();

        System.out.println("Enter the value of T = ");
        t = input.nextDouble();

        double si = (p * r * t)/100 ;
        System.out.println("Simple Interest = "+si);
    }
}
