package com.resilientassignments;

import java.util.Scanner;

public class Assignment1 {

    public static void main(String[] args) {

        int a ,b ,total;
        Scanner input = new Scanner(System.in);

        System.out.println("enter 1st number = ");
        a = input.nextInt();

        System.out.println("enter 2nd number = ");
        b = input.nextInt();
        input.close();

        total = a + b;
        System.out.println("Total = "+total);
    }
}

