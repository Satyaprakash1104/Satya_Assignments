public class Drome0rNot {
    public static void main(String args[]) {
        int i, sum = 0, temp;
        int num = 454;

        temp = num;
        while (num > 0) {
            i = num % 10;
            sum = (sum * 10) + i;
            num = num / 10;
        }
        if (temp == sum)
            System.out.println("palindrome number ");
        else
            System.out.println("not palindrome");
    }
}
