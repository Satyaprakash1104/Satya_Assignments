package SwitchCase;

import java.util.Scanner;

public class ConsonantAndVowel {

    public static void main(String[] args){

        char al  ;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the alphabet: ");
        al = input.next().charAt(0);

        switch(al){
            case 'a':
            case'e':
            case'i':
            case 'o':
            case 'u':
                System.out.println(al+ "  is a vowel.");
                break;
            default:
                System.out.println("The value is consonant.");


        }
    }
}
