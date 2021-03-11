package Section5;

public class c68 {
    public static void main(String[] args) {
        int number = 2;
        int evenNumbersFound = 0;

        do {
            number++;
            if (isEvenNumber(number)) {
                System.out.println("Even number " + number);
                evenNumbersFound++;
            }
        } while (evenNumbersFound < 5);
        System.out.println(evenNumbersFound + " even numbers found");
    }

    public static boolean isEvenNumber(int testNumber) {
        return testNumber % 2 == 0;
    }
}
