package com.resilientassignments;

import java.util.Scanner;

public class Assignment9 {

    public static void main(String[] args) {

        int days,years,weeks,day;

        Scanner input = new Scanner(System.in);
        System.out.println("enter the number of days = ");

        days = input.nextInt();
        years = days / 365;
        weeks = ((days%365)/7);
        day = days-((years*365)+(weeks*7));

        System.out.println("years = "+years+ ", weeks = "+weeks+ "day = "+day);
    }
}
