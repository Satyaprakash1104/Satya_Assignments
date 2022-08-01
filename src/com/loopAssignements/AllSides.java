package com.loopAssignements;

import java.util.Scanner;

public class AllSides {
    public static void main(String[] args){

        float ac ,ab ,bc ;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first side : ");
        ac = input.nextFloat();
        System.out.println("Enter the second side : ");
        ab = input.nextFloat();
        System.out.println("Enter the third side : ");
        bc = input.nextFloat();

        if (ac + bc > ab && ab + ac > bc && bc + ab > ac){
            System.out.println("The Triangle is valid . ");
        }
        else{
            System.out.println("The triangle is not Valid");
        }
    }
}
