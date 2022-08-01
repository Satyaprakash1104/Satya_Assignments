public class OneCompliment {
    public int findComplement(int num) {

        int originalNum = num;


        long i = 1;

        while(i<=originalNum) {

            num ^= i;
            i <<= 1;
        }

        return num;
    }
}
