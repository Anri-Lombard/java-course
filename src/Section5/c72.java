package Section5;

import java.util.Scanner;

public class c72 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your year of birth: ");
        int yearOfBirth = scanner.nextInt();
        int age = 2021 - yearOfBirth;

        System.out.println("Please enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Your name is " + name + " and you are " + age + " years old.");

        scanner.close();
    }
}
