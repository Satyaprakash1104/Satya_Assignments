package com.resilientassignments;

import java.util.Scanner;

public class Assignment14 {

    public static void main(String[] args) {

        double a,area ;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the side = ");
        a = input.nextDouble();

        area = (1.73*(a*a))/4;
        System.out.println("area of the equilateral triangle = "+area);
    }
}
