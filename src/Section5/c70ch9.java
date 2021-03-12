package Section5;

public class c70ch9 {
    public static void main(String[] args) {
        numberToWords(1150);
    }

    public static void numberToWords(int number){
        if (number < 0) {
            System.out.println("Invalid Value");
        }

        String digitsToWords = "";

        int reversedNumber = reverse(number);
        for (int i=0;i<getDigitCount(number);i++){

            switch (reversedNumber % 10) {
                case 0:
                    digitsToWords += "Zero ";
                    break;
                case 1:
                    digitsToWords += "One ";
                    break;
                case 2:
                    digitsToWords += "Two ";
                    break;
                case 3:
                    digitsToWords += "Three ";
                    break;
                case 4:
                    digitsToWords += "Four ";
                    break;
                case 5:
                    digitsToWords += "Five ";
                    break;
                case 6:
                    digitsToWords += "Six ";
                    break;
                case 7:
                    digitsToWords += "Seven ";
                    break;
                case 8:
                    digitsToWords += "Eight ";
                    break;
                case 9:
                    digitsToWords += "Nine ";
                    break;
            }
            reversedNumber /= 10;
        }
        System.out.println(digitsToWords);
    }

    public static int reverse(int number) {
        int reverseNumber = 0;

        while (number != 0) {
            reverseNumber = (reverseNumber * 10) + (number % 10);
            number /= 10;
        }
        return reverseNumber;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        int count = 1;
        while(number > 9) {
            number /= 10;
            count++;
        }
        return count;
    }
}
