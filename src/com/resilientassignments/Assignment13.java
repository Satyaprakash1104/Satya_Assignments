package com.resilientassignments;

import java.util.Scanner;

public class Assignment13 {

    public static void main(String[] args) {

        double b, h ;

        Scanner input = new Scanner(System.in);

        System.out.println("enter the base = ");
        b = input.nextInt();

        System.out.println("enter the height = ");
        h = input.nextInt();

        double area = 0.5 *(b*h);
        System.out.println("Area = "+area);
    }
}
