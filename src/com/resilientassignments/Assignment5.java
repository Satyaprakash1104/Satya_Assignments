package com.resilientassignments;

import java.util.Scanner;

public class Assignment5 {

    public static void main(String [] args) {

        double radius ,area ,diameter ,circumference;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius of the circle = ");

        radius = input.nextDouble();
        input.close();

        area = Math.PI * radius * radius;
        System.out.println("Area of the circle is " +area);

        circumference = 2*(Math.PI * radius);
        System.out.println("Circumference of the circle is " +circumference);

        diameter = 2 * radius;
        System.out.println("diameter = " +diameter);


    }
}
