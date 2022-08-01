package com.resilientassignments;

import java.util.Scanner;

public class Assignment12 {

    public static void main(String[] args) {

        double angle1 , angle2 ,angle3;

        Scanner input =new Scanner(System.in);

        System.out.println("first angle = ");
        angle1 = input.nextDouble();

        System.out.println("second angle = ");
        angle2 = input.nextDouble();

        angle3 = 180 -(angle1 + angle2);
        System.out.println("Third angle = " +angle3);

    }
}
