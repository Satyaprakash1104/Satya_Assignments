import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n= sc.nextInt();

        System.out.println("The Multiplication Table of " + n + " is :");

        int i = 1;
        while (i <= 10) {

            int ans = n * i;
            System.out.println("" + n + " X " + i + " = " + ans);
            ++i;
        }
    }
}
