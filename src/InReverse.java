import java.util.Scanner;

public class InReverse {

        public static void main(String[] args) {




            int i  = 1;


            Scanner Sc = new Scanner(System.in);


            System.out.print("Enter the value n : ");


            int n = Sc.nextInt();

            System.out.println("Numbers are : ");

            while (n >= i) {
                System.out.println(n);
                n--;
            }
        }
    }

