package com.resilientassignments;

import java.util.Scanner;

public class Assignment7 {

    public static void main(String[] args) {

        double temp ,inFahrenheit;

         Scanner input = new Scanner(System.in);

        System.out.println("Enter temperature = ");
        temp = input.nextDouble();

        inFahrenheit = (temp *9/5) + 32;
        System.out.println("Temperature in Fahrenheit = "+inFahrenheit);
    }
}

