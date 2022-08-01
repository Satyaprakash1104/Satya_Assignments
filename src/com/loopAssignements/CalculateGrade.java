package com.loopAssignements;

import java.util.Scanner;

public class CalculateGrade {

    public static void main(String[] args) {

        double physics, chemistry, biology, mathematics, computer, TotalMarks = 500;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the marks in physics : ");
        physics = input.nextFloat();
        System.out.println("Enter the marks in chemistry : ");
        chemistry = input.nextFloat();
        System.out.println("Enter the marks in biology : ");
        biology = input.nextFloat();
        System.out.println("Enter the mark in mathematics : ");
        mathematics = input.nextFloat();
        System.out.println("Enter the marks in computer : ");
        computer = input.nextFloat();

        double MarksObtained = ((physics + chemistry + mathematics + computer + biology) / TotalMarks) * 100;

        if (MarksObtained >= 90){
            System.out.println("Grade A");
        }
        else if (MarksObtained >= 80){
            System.out.println("Grade B");
        }
        else if (MarksObtained >= 70){
            System.out.println("Grade C");
        }
        else if (MarksObtained >= 60){
            System.out.println("Grade D");
        }
        else if (MarksObtained >= 50){
            System.out.println("Grade E");
        }
        else if (MarksObtained >= 40){
            System.out.println("Grade F");
        }
        else{
            System.out.println("Fail");
        }
    }
}
