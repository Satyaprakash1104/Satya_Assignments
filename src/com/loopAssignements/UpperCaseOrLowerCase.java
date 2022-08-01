package com.loopAssignements;

import java.util.Scanner;

public class UpperCaseOrLowerCase {

    public static void main(String[] args) {
        char ch ;
        Scanner r = new Scanner(System.in);
        System.out.println("Enter a Character : ");
        ch = r.next().charAt(0);

        if (ch >= 'a' && ch <= 'z'){
            System.out.println("Lower case");
        }
        else if (ch >= 'A' && ch <= 'Z'){
            System.out.println("Upper Case");

        }
        else {

        }
    }
}
