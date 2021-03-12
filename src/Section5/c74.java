package Section5;

import java.util.Scanner;

public class c74 {
    public static void main(String[] args) {
        int counter = 0;

        Scanner scanner = new Scanner(System.in);
        while (true) {
            counter++;
            System.out.println("Enter number #" + counter);
            int enteredNumber = scanner.nextInt();

            if (enteredNumber == counter) {
                System.out.println("You pass...");
            } else {
                System.out.println("Wrong number. Game Over.");
                break;
            }
            scanner.nextLine();
        }

        scanner.close();
    }
}
