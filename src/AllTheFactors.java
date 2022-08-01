import java.util.Scanner;

public class AllTheFactors {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);


            System.out.print("Enter any number : ");
            int num = scanner.nextInt();

            System.out.println("\nAll factors of " + num + " are : ");

            for (int i = 1; i <= num; i++) {

                if (num % i == 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }
