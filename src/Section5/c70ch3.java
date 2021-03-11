package Section5;

public class c70ch3 {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(252));
    }

    public static int getEvenDigitSum(int number) {
        if(number < 0) {
            return -1;
        }

        int digit;
        int sum = 0;

        while (number > 0) {
            digit = number % 10;
//            System.out.println("d = " + digit);
            if (digit % 2 == 0) {
                sum += digit;
//                System.out.println("s = " + sum);
            }
            number /= 10;
//            System.out.println("n = " + number);
        }
        return sum;
    }
}
