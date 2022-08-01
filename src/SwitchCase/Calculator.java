package SwitchCase;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args){

        char sign;
        double number1 ,number2,result;

        Scanner input = new Scanner(System.in);
        System.out.println("enter the operator : ");
        sign = input.next().charAt(0);

        System.out.println("enter the first number : ");
        number1 = input.nextDouble();
        System.out.println("enter the second number : ");
        number2 = input.nextDouble();

        switch (sign){
            case '+':
                result = number1 + number2;
                System.out.println("Result = "+result);
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 *number2;
                break;
            case '/':
                result = number1 / number2;
                break;
            default:
                System.out.println("Invalid operator");


        }
    }
}
