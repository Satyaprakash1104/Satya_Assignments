package com.loopAssignements;

import java.util.Scanner;

public class SpecialCharacter {

    public static void main(String[] args){

        char  i ;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Character : ");
        i = input.next().charAt(0);

        if (i >= 'a' && i <= 'z'|| i >= 'A' && i <= 'Z'){
            System.out.println("Alphabet");
        }
        else if (i >= '1' && i <= '9'){
            System.out.println("Digit");
        }
        else {
            System.out.println("Special Character");
        }
    }
}
