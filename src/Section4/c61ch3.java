package Section4;

public class c61ch3 {
    public static void main(String[] args) {
        printEqual(1,1,1);
        printEqual(1,1,2);
        printEqual(-1,-1,-1);
        printEqual(1,2,3);
    }

    public static void printEqual(int firstNum, int secondNum, int thirdNum) {
        if (firstNum >= 0 && secondNum >= 0 && thirdNum >= 0) {
            if (firstNum == secondNum && secondNum == thirdNum) {
                System.out.println("All numbers are equal");
            } else if (firstNum != secondNum && secondNum != thirdNum && thirdNum != firstNum) {
                System.out.println("All numbers are different");
            } else {
                System.out.println("Neither all are equal or different");
            }
        } else {
            System.out.println("Invalid Value");
        }
    }
}
