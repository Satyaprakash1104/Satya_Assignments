package com.resilientassignments;

import java.util.Scanner;

public class Assignment10 {

    public static void main(String[] args) {

        int n , p ,result = 1;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number = ");
        n = input.nextInt();

        System.out.println("enter power");
        p = input.nextInt();

        for (int i = 1;i<=p;i++) {
            result = n * result;
        }
        System.out.println("Result = "+result);
    }
}
