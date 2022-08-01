package TernaryOperators;

import java.util.Scanner;

public class MaximumBetweenTwo {

    public static void main(String[] args){

                int a , b ,Max;
                Scanner input = new Scanner(System.in);
                System.out.println("Enter the first number :");
                a = input.nextInt();
                System.out.println("Enter the second number :");
                b = input.nextInt();
                Max = a > b ? a : b ;
                System.out.println("Maximum number  :  " +Max);
            }
        }

