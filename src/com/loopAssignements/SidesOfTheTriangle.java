package com.loopAssignements;

import java.util.Scanner;

public class SidesOfTheTriangle {
    public static void main(String[] args) {

        float a  , b ,c;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first side :");
        a = input.nextFloat();
        System.out.println("Enter the second side : ");
        b = input.nextFloat();
        System.out.println("Enter the third side : ");
        c = input.nextFloat();

        if (a == b && b == c){
            System.out.println("Equilateral triangle .");
        }
        else if (a == b || b == c || a == c){
            System.out.println("Isosceles triangle");
        }
        else{
            System.out.println("Scalene triangle");
        }

    }
}
