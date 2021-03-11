package Section4;

public class c57ch1 {
    public static void main(String[] args) {
        printConversion(10);
    }

    public static int toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0){
            return -1;
        } else {
            double milesPerHour = kilometersPerHour * 0.62137119223733;
            return (int) Math.round(milesPerHour);
        }
    }

    public static void printConversion(double kilometersPerHour) {
        System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
    }
}
