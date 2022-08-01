

public class NumberOfDigits {
    public static void main(String[] args){
        int numberOfDigit = 0;

        int number = 5000 ;

        int temp = number ;

        while(number!= 0){
            number = number/10;


            numberOfDigit++;
            System.out.println("The  number of digit in the "+temp+"are "+numberOfDigit);

        }
    }
}
