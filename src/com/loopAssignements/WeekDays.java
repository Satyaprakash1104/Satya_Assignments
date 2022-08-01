package com.loopAssignements;

import java.util.Scanner;

public class WeekDays {

    public static void main(String[] args){

        int WeekDayNumber;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the week day number : ");
        WeekDayNumber = input.nextInt();

        if (WeekDayNumber == 1){
            System.out.println(" it's Sunday");
        }
        else if (WeekDayNumber == 2){
            System.out.println("it's Monday");
        }
        else if (WeekDayNumber == 3){
            System.out.println("it's tuesday");
        }
        else if (WeekDayNumber == 4){
            System.out.println("it's Wednesday");
        }
        else if (WeekDayNumber == 5){
            System.out.println("its Thursday");
        }
        else if (WeekDayNumber == 6){
            System.out.println("it's Friday");
        }
        else if (WeekDayNumber == 7){
            System.out.println("it's Saturday");
        }
        else {
            System.out.println("Please enter week number between 1-7.");
        }
    }
}
