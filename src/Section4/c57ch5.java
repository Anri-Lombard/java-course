package Section4;

public class c57ch5 {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.176, -3.175));
    }

    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber) {
        if (firstNumber >= 0 && secondNumber >= 0) {
            return Math.floor(firstNumber * 1000) == Math.floor(secondNumber * 1000);
        } else if (firstNumber < 0 && secondNumber < 0) {
            return Math.floor(firstNumber / 1000) == Math.floor(secondNumber / 1000);
        }
        return false;
    }
}
