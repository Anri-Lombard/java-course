package Section5;

public class c71ch2 {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(45));
    }

    public static int getLargestPrime(int number) {
        if (number < 2) {
            return -1;
        }

        for (int i=2; i<number; i++) {
            if (number % i == 0) {
//                System.out.println("i before divide = "+ i);
//                System.out.println("number before divide = " + number);
                number /= i;
//                System.out.println("number after divide = "+ number);
                i--; // Number chosen, so should be looped again to see if it is prime it seems.
//                System.out.println("i after -- = "+ i);
            }
        }
        return number;
    }
}
