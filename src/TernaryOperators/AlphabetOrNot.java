package TernaryOperators;

import java.util.Scanner;

public class AlphabetOrNot {
    public static void main(String[] args){
        char al ;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the character : ");
        al = input.next().charAt(0);

        String result = ((al >= 'a' && al <= 'z') || (al >= 'A' && al <= 'Z')) ? "Alphabet" : "Not Alphabet";
        System.out.println("The given character is "+result);
    }
}
