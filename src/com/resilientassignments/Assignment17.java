package com.resilientassignments;

import java.util.Scanner;

public class Assignment17 {

    public static void main(String[] args) {

        double p , r , t = 1 , ci ,amount = 0 ;
        Scanner input = new Scanner(System.in);

        System.out.println("enter Principal amount = ");
        p = input.nextDouble();

        System.out.println("Enter the rate of interest = ");
        r = input.nextDouble();

        System.out.println("Enter the time period = ");
        t = input.nextDouble();

        r = (1 + r/100) ;

        for (double i = 0 ; i < t ; i++);
        t = t * r ;
        amount = p * t ;
        System.out.println("Amount : "+amount);
        ci = amount - p ;
        System.out.println("Compound Interest : "+ci);
    }
}
