package com.resilientassignments;

import java.util.Scanner;

public class Assignment8 {

    public static void main(String [] args){

        double temp ,inCelsius;

        Scanner input = new Scanner(System.in);

        System.out.println("Temperature in Fahrenheit = ");

        temp = input.nextDouble();

        inCelsius = (temp - 32)* 9/5;
        System.out.println("New temperature = " +inCelsius);
    }
}
