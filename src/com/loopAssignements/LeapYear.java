package com.loopAssignements;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {

        int y ;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any year : ");
        y = input.nextInt();

        if (y % 100 == 0 && y % 400 == 0  || y % 100 != 0 && y % 4 ==0){
            System.out.println("Leap Year");
        }
        else {
            System.out.println("Not a Leap Year");
        }
    }
}
