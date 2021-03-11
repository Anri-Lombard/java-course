package Section5;

public class c70ch2 {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }

        int lastDigit = number % 10;
//        System.out.println("ln = " + lastDigit);
        while (number > 9) {
            number /= 10;
//            System.out.println("n = " + number);
        }
        return lastDigit + number;
    }
}
