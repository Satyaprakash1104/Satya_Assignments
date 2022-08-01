import java.util.Scanner;

public class AllArmstrong{
    public static void main(String[] args) {
        int a,
                b = 0,
                temp,
                n,
                num;
        Scanner sc = new Scanner(System. in );

        System.out.println("Enter the value of n: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            num = i;
            b = 0;
            while (num > 0) {
                a = num;
                num = num / 10;
                b = b + (a * a * a);
            }
            if (i == b) System.out.println(i);
        }
    }
}


