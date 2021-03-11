package Section5;

public class c70ch5 {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(9,99,999));
    }

    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        if (isValid(num1) && isValid(num2) && isValid(num3)) {
            int num1LastDigit = num1 % 10;
            int num2LastDigit = num2 % 10;
            int num3LastDigit = num3 % 10;

            return (num1LastDigit == num2LastDigit) || (num2LastDigit == num3LastDigit) || (num3LastDigit == num1LastDigit);
        }
        return false;
    }

    public static boolean isValid(int num) {
        return (num >= 10 && num <= 1000);
    }
}
