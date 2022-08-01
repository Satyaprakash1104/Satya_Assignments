package SwitchCase;

import java.util.Scanner;

public class NumberOfDays {

    public static void main(String[] args){
        int month ;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the month number : ");
        month = input.nextInt();


        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 days");
                break;

            case 2:
                System.out.println("28/29");
                break;
            default:
                System.out.println("invalid month");


        }


    }
}
