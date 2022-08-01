package com.resilientassignments;

import java.util.Scanner;

public class Assignment3 {

    public static void main(String[] args) {

        int lengthOfRectangle ;
        int breadthOfRectangle ;
        int radius , perimeter ;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter l = " );
        lengthOfRectangle = input.nextInt();

        System.out.println("Enter b = ");
        breadthOfRectangle = input.nextInt();

        input.close();

        perimeter = 2* (lengthOfRectangle + breadthOfRectangle);
        System.out.println( "Perimeter = "+perimeter );


    }
}
