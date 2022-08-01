import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class FrequencyOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();

        Map<Integer, Integer> digitMap = new HashMap<Integer, Integer>();
        int remainder = 0;

        while (number > 0) {

            remainder = number % 10;
            // get the frequency count of this digit
            Integer count = digitMap.get(remainder);

            if (count == null) {
                digitMap.put(remainder, 1);
            } else {

                digitMap.put(remainder, ++count);
            }

            number = number / 10;
        }
        System.out.println("-------------------------");
        System.out.println("Number\tFrequency");
        System.out.println("-------------------------");
        Iterator iterator = digitMap.keySet().iterator();
        while (iterator.hasNext()) {
            int digit = (int) iterator.next();
            int digitCount = digitMap.get(digit);
            System.out.println(digit + "\t" + digitCount);
        }
        scanner.close();
    }
}
