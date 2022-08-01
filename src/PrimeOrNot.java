import java.util.Scanner;

public class PrimeOrNot {

    public static void main(String[] args){

        int number ,n = 1;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number : ");
        number = input.nextInt();

        if (number%number== 0 || number%n== 0){
            System.out.println("The number is prime .");
        }
        else{
            System.out.println("Not prime");
        }
    }
}
