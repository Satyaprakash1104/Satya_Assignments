package com.loopAssignements;

import java.util.Scanner;

public class VowelOrNot {

    public static void main(String[] args) {
        char input;
        System.out.println("Enter any character : ");
        Scanner r =new Scanner(System.in);
        input = r.next().charAt(0);

        if (input == 'a' || input =='e'|| input =='i' || input =='o'|| input =='u' ||
                input == 'A' || input =='E' || input =='I'|| input =='O'|| input == 'U'){
            System.out.println("VALUE IS A VOWEL.");
        }
        else {
            System.out.println("VALUE IS A CONSTANT");
        }
    }
}
