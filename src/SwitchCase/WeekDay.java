package SwitchCase;

import java.util.Scanner;

public class WeekDay {
    public static void main(String[] args) {

        int days;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the weekday number between 1 and 7 : ");
        days = input.nextInt();

        if (days < 1 || days > 7) {
            System.out.println("Invalid Week day ");
            System.exit(1);
        }
        switch (days) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
            case 4:
                System.out.println("Wednesday");
            case 5:
                System.out.println("Thursday");
            case 6:
                System.out.println("Friday");
            case 7:
                System.out.println("Saturday");
            default:
                System.out.println("Invalid");
        }
    }
}