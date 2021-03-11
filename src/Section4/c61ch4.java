package Section4;

public class c61ch4 {
    public static void main(String[] args) {
        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (!summer) {
            return temperature <= 35 && temperature >= 25;
        } else {
            return temperature <= 45 && temperature >= 25;
        }
    }
}
