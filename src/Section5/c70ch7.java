package Section5;

public class c70ch7 {
    public static void main(String[] args) {
        printFactors(6);
    }

    public static void printFactors(int number) {
        String factors = "";
        if (number < 1) {
            System.out.println("Invalid Value");
        }

        for (int i=1;i<=number;i++) {
            if (number % i == 0) {
                factors += i + " ";
            }
        }
        System.out.println(factors);
    }
}
