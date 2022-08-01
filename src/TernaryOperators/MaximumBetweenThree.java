package TernaryOperators;

import java.util.Scanner;

public class MaximumBetweenThree {
    public static void main(String[] args){

        int a , b , c , Max ;


        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number :");
        a = input.nextInt();
        System.out.println("Enter the second number :");
        b = input.nextInt();
        System.out.println("Enter the third number : ");
        c = input.nextInt();

        Max = (a > b) ? (a > c ? a : c) :(b > c ? b : c);
        System.out.println("Maximum number  :  " +Max);
            }
        }




