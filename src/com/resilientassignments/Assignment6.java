package com.resilientassignments;

import java.util.Scanner;

public class Assignment6 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length in Centimeter = ");
        int cen = input.nextInt();

        double meter = cen / 100.0;
        double kilometer = meter / 1000.0;

        System.out.println(" length in meter = "+meter+
                ", length in kilometer = "+kilometer);
    }
}
