package Section5;

public class c70ch4 {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12,13));
    }

    public static boolean hasSharedDigit(int num1, int num2){
        if ((num1 < 10 || num1 > 99) || (num2 < 10 || num2 > 99)) {
            return false;
        }

        int num1Digit;
        int num2Digit;
        while (num1 > 0) {
            int num2ph = num2;
            num1Digit = num1 % 10;
            System.out.println("num1d = " + num1Digit);

            while (num2ph > 0) {
                num2Digit = num2ph % 10;
                System.out.println("num2d = " + num2Digit);

                if (num1Digit == num2Digit) {
                    return true;
                }

                num2ph /= 10;
                System.out.println("num2ph = " + num2ph);
            }

            num1 /= 10;
            System.out.println("num1 = " + num1);
        }
        return false;
    }
}
