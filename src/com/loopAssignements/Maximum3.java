package com.loopAssignements;

public class Maximum3 {

    public static void main(String[] args) {
        int number1 = 12, number2 = 15, number3 = 12;

        if (number1 > number2 && number1 > number3) {
            System.out.println(number1);
        } else if (number2 > number3 && number2 > number3) {
            System.out.println(number2);
        } else {
            System.out.println(number3);
        }
    }
}
