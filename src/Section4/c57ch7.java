package Section4;

public class c57ch7 {
    public static void main(String[] args) {
        System.out.println(hasTeen(13, 66, 99));
    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
        return (isTeen(firstAge) || isTeen(secondAge) || isTeen(thirdAge));
    }

    public static boolean isTeen(int age){
        return (age >= 13 && age <= 19);
    }
}


