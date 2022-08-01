package com.loopAssignements;

import java.util.Scanner;

public class MonthDay {

    public static void main(String[] args) {

        int MonthNumber, Days;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the month number : ");
        MonthNumber = input.nextInt();

        if (MonthNumber == 1 || MonthNumber == 3 || MonthNumber == 5 || MonthNumber == 7 || MonthNumber == 8
                || MonthNumber == 10 || MonthNumber == 12) {
            System.out.println("31 Days");
        }
        else if (MonthNumber == 4 || MonthNumber == 6 || MonthNumber == 9 || MonthNumber == 11){
            System.out.println("30 days");
        }
        else if (MonthNumber == 2){
            System.out.println(" 28 days");
        }
        else {
            System.out.println("Invalid month number");
        }



    }
}
