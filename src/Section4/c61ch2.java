package Section4;

public class c61ch2 {
    public static void main(String[] args) {
        printYearsAndDays(561600);
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes > 0) {
            long totalDays = minutes / 60 / 24;
            System.out.println(totalDays);
            long years =  totalDays / 365;
            long daysLeft = totalDays % 365;
            System.out.println(minutes + " minutes = " + years + " years and " + daysLeft + " days");
        } else {
            System.out.println("This is not a valid value");
        }
    }
}
