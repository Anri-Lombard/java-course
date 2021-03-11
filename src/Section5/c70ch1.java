package Section5;

public class c70ch1 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-222));
    }

    public static boolean isPalindrome(int number) {
        // Palindrome is a word, sequence, or number read the same forwards and backwards.
        int reverse = 0;
        if (number < 0) {
            number *= -1;
        }
        int originalNumber = number;

        while (number > 0) {
            // Always calculates the last digit.
            int lastDigit = number % 10;
//            System.out.println("Last digit = " + lastDigit);

            // Increase place value by one.
            reverse = reverse * 10;
//            System.out.println("Reverse = " + reverse);
            reverse += lastDigit;
//            System.out.println("Reverse = " + reverse);

            number /= 10;
//            System.out.println("Number = " + number);
        }
        return reverse == originalNumber;
    }
}
