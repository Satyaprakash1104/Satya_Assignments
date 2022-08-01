package SwitchCase;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args){
        int value1 , value2 , num = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number :");
        value1 = input.nextInt();
        System.out.println("Enter the second number :");
        value2 = input.nextInt();

        if( value1 > value2){
            num = 0;

        }
        else if(value2>value1){
            num = 1;
        }
        switch( num){
            case 0:
                System.out.println(value1+ " is greater .");
                break;
            case 1:
                System.out.println(value2+ " is greater .");
                break;
            default:
                System.out.println("both are equal .");

        }

        }


    }

