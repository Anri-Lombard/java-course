package Section4;

public class c57ch3 {
    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 7));
    }

    public static boolean shouldWakeUp(boolean currentlyBarking, int hourOfDay) {
        if (0 <= hourOfDay && hourOfDay < 24) {
            return (hourOfDay > 22 || hourOfDay < 8) && currentlyBarking;
        }

        return false;
    }
}
