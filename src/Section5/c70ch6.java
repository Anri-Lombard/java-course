package Section5;

public class c70ch6 {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(81,153));
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }

        int i = 0, h = 0;
        int divisor = 0;
        while(i<=first && h<=second) {
            i++;
            h++;
            if (first % i == 0 && second % h == 0) {
                divisor = i;
            }
        }
        return divisor;
    }
}
