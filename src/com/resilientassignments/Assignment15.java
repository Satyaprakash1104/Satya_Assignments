package com.resilientassignments;

import java.util.Scanner;

public class Assignment15 {

    public static void main(String[] args) {

        double marks1,marks2,marks3,marks4,marks5;
        Scanner input =new Scanner(System.in);

        System.out.println("first subject =");
        marks1 = input.nextDouble();

        System.out.println("second number = ");
        marks2 = input.nextDouble();

        System.out.println("third number =");
        marks3 = input.nextDouble();

        System.out.println("fourth number = ");
        marks4 = input.nextDouble();

        System.out.println("Fifth number = ");
        marks5 = input.nextDouble();

        double total = marks1 + marks2 + marks3 + marks4 +marks5;
        double average = total/5 ;

        double percentage = (total/500)*100
                ;

        System.out.println("total marks is "+total+ " and average is "+average+ "and percentage is" +percentage);
    }
}
