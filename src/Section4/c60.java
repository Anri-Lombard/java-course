package Section4;

public class c60 {
    public static void main(String[] args) {
        System.out.println(getDurationString(12301));
    }

    public static String getDurationString(int min, int sec) {
        if (min >= 0 && (sec >= 0 && sec <= 59)) {
            int totalSeconds = min * 60;
            int hours = totalSeconds / 3600;
            if (hours < 1) {
                hours = 0;
            }
            int minutes = (totalSeconds % 3600) / 60;
            String hoursString = "" + hours, minutesString = "" + minutes, secondsString = "" + sec;
            if (hours < 10) {
                hoursString = "0" + hours;
            }
            if (minutes < 10) {
                minutesString = "0" + minutes;
            }
            if (sec < 10) {
                secondsString = "0" + sec;
            }
            return hoursString + "h " + minutesString + "m " + secondsString + "s";
        }
        return "Invalid value";
    }

    public static String getDurationString(int sec) {

        if (sec >= 0) {
            if (sec > 60) {
                int minutes = sec / 60;
                int seconds = sec % 60;
                return getDurationString(minutes, seconds);
            }
        }
        return "Invalid value";
    }
}
