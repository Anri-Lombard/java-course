package Section5;

public class c70ch8 {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(-1));
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }

        int sumOfDivisors = 0;
        for (int i =1;i<number;i++) {
            if (number % i == 0) {
                sumOfDivisors += i;
                if (sumOfDivisors == number) {
                    return true;
                }
            }
        }
        return false;
    }
}
