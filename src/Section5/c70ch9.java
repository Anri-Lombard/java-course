package Section5;

public class c70ch9 {
    public static void main(String[] args) {
        System.out.println(reverse(210));
    }

//    public static String numberToWords(int number){
//
//    }

    public static int reverse(int number) {
        int reverse = 0;
        int reverseCount = 0;
        String str = "";
        int originalNumber = number;

        if (number < 0) {
            number *= -1;
        }

        while (number > 0) {
            int lastDigit = number % 10;

            reverse *= 10;
            reverse += lastDigit;

            number /= 10;
        }
        int reversePlaceholder = reverse;
        while (reversePlaceholder > 0) {
            reverseCount++;
            reversePlaceholder /= 10;
        }
        if (reverseCount != getDigitCount(originalNumber)) {
            int zerosNeeded = getDigitCount(originalNumber) - reverseCount;
            System.out.println(reverse);
            str = String.format("%02d", reverse);
            System.out.println(str);
        }
        reverse = Integer.parseInt(str);
        return reverse;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        int count = 0;
        if (number == 0){
            number = 1;
        }
        while (number > 0) {
            count++;
            number /= 10;
        }
        return count;
    }
}
