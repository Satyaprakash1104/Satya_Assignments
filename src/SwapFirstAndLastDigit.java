public class SwapFirstAndLastDigit {
    public static void main(String[] args)
    {
        int n = 12345;
        // find the first digit
        int lastDigit = n % 10;
        // find last digit
        int digitsCount = (int) Math.log10(n);
        // Find first digit
        int firstDigit = (int) (n / Math.pow(10, digitsCount));
        // swap the first and last digits
        int swappedNum = lastDigit;
        swappedNum *= (int) Math.pow(10, digitsCount);
        swappedNum += n % ((int) Math.pow(10, digitsCount));
        swappedNum -= lastDigit;
        swappedNum += firstDigit;
        System.out.println("The Number after Swapping First Digit and Last Digit = " + swappedNum);
    }
}
