package Section5;

import java.util.Scanner;

public class c72 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your year of birth: ");

        boolean hasNextInt = scanner.hasNextInt();

        if (hasNextInt) {
            int yearOfBirth = scanner.nextInt();

            int age = 2021 - yearOfBirth;
            scanner.nextLine();

            System.out.println("Please enter your name: ");

            String name = scanner.nextLine();

            if (age >= 0 && age <= 100) {
                System.out.println("Your name is " + name + " and you are " + age + " years old.");
            } else {
                System.out.println("Invalid year of birth");
            }
        } else {
            System.out.println("Unable to parse year of birth");
        }

        scanner.close();
    }
}
