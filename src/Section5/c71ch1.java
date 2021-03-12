package Section5;

public class c71ch1 {
    public static void main(String[] args) {
        System.out.println(canPack(2,2,11));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (smallCount < 0 || bigCount < 0 || goal < 0) {
            return false;
        }

        bigCount *= 5;
        return bigCount + smallCount <= goal;
    }
}
