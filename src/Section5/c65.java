package Section5;

public class c65 {
    public static void main(String[] args) {
//        for (int i = 8; i > 1; i--) {
//            System.out.println(i + "% interest on 2000 rand = " + String.format("%.2f",calculateInterest(2000, i)) + " rand");
//        }

        int primeFound = 0;
        for (int i=100; i<200; i++) {
            if (isPrime(i)) {
                primeFound++;
                System.out.println(i + " is a prime number");
                if (primeFound == 3) {
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return(amount *(interestRate/100));
    }

    public static boolean isPrime(int n) {
        if(n == 1) {
            return false;
        }

        for(int i=2; i<=(long)Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
