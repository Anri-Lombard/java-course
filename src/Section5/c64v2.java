package Section5;

public class c64v2 {
    public static void main(String[] args) {
        int dayOfTheWeek = 9;
        String day;

        if (dayOfTheWeek == 1) {
            day = "Monday";
        } else if (dayOfTheWeek == 2) {
            day = "Tuesday";
        } else if (dayOfTheWeek == 3) {
            day = "Wednesday";
        } else if (dayOfTheWeek == 4) {
            day = "Thursday";
        } else if (dayOfTheWeek == 5) {
            day = "Friday";
        } else if (dayOfTheWeek == 6) {
            day = "Saturday";
        } else if (dayOfTheWeek == 7) {
            day = "Sunday";
        } else {
            day = "Invalid day";
        }
        System.out.println(day);
    }
}
