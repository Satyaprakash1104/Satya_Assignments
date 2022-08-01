package com.resilientassignments;

import java.util.Scanner;

public class Assignment4 {

    public static void main(String [] args) {

        int lengthOfRectangle ;
        int breadthOfRectangle , area ;
        Scanner input = new Scanner(System.in);
        System.out.println("enter the l = ");
        lengthOfRectangle = input.nextInt();

        System.out.println("enter the b = ");
        breadthOfRectangle = input.nextInt();

        area = lengthOfRectangle * breadthOfRectangle;
        System.out.println("Area = " +area);
    }
}
