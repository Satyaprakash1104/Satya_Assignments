package SwitchCase;

import java.util.Scanner;

public class EvenOrOdd {
    public static void  main(String[]args) {

        int number, a = 2 ;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number :");
        number = input.nextInt();



        switch(number%a) {
            case 0:
                System.out.println("Number is even");
                break;
            case 1:
                System.out.println("NUMBER IS ODD");



        }
    }

    }
