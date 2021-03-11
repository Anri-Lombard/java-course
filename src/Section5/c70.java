package Section5;

public class c70 {
    public static void main(String[] args) {
        System.out.println(sumDigits(133));
    }

    private static int sumDigits(int number) {
        if (number < 10) {
            return -1;
        }

        int sum = 0;

        // 125 -> 125 / 10 = 12 -> 12 * 10 = 120 -> 125 -120 = 5
        while (number > 0) {
            // get least significant digit
            int digit = number % 10;
            System.out.println("Digit = " + digit);
            sum += digit;

            // drop the least significant digit
            number /= 10;
            System.out.println("Number = " + number);
        }

        return sum;
    }
}
