package TernaryOperators;

import java.util.Scanner;

public class LeapYearOrNot {

    public static void main(String[] args){
         int year  ;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the year : ");
        year = input.nextInt();
        String result = year%100 == 0 && year%400 ==0||year%100 != 0 && year%4 == 0? "A leap year":"Not a leap year";
        System.out.println("this year is " +result);

    }

}
