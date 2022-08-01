package TernaryOperators;

import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args){

        int a ;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number : ");
        a = input.nextInt();

       String number = (a % 2 == 0) ? "even" : "odd";
        System.out.println("Number is : " +number);


    }
}
