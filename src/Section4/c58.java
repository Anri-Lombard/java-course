package Section4;

public class c58 {
    public static void main(String[] args) {
        calcFeetAndInchesToCentimeters(3456);
    }

    public static double calcFeetAndInchesToCentimeters(double foot, double inches) {
        if (foot >= 0 && (inches >= 0 && inches <= 12)) {
            return foot * 30.48 + inches * 2.54;
        }
        return -1;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches >= 0) {
            double foot = Math.floor(inches / 12);
            double inchesLeft = inches % 12;
            System.out.println(calcFeetAndInchesToCentimeters(foot, inchesLeft));
        }
        return -1;
    }
}
