package Section5;

public class c64ch2 {
    public static void main(String[] args) {
        System.out.println(getDaysInMonth(1,2020));
        System.out.println(getDaysInMonth(2,2020));
        System.out.println(getDaysInMonth(2,2018));
        System.out.println(getDaysInMonth(-1,2020));
        System.out.println(getDaysInMonth(1,-2020));
    }

    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999){
            if (year % 400 == 0) {
                return year % 400 == 0;
            } else if (year % 4 == 0) {
                return year % 100 != 0;
            }
        }
        return false;
    }

    public static int getDaysInMonth(int month, int year) {
        if (year >= 0 && year <= 9999) {
            if (month <= 12 && month >= 1) {
                switch(month) {
                    case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                        return 31;
                    case 2:
                        if (isLeapYear(year)) {
                            return 29;
                        } else {
                            return 28;
                        }
                    case 4: case 6: case 9: case 11:
                        return 30;
                }
            }
            return -1;
        }
        return -1;
    }
}
