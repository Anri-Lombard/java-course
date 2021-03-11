package Section3;

import java.util.Arrays;

public class c30 {
    public static void main(String[] args){
        double pounds = 100d;
        double poundsToKilograms = 0.45359237d;
        double kilograms = pounds * poundsToKilograms;

        System.out.println("The kilograms in " + pounds + " pounds are " + kilograms + ".");
        System.out.println("This rock is breaking little by little! I can feel the revolution coursing through my veins.");
        System.out.println("kilograms = " + kilograms);
        System.out.println("args = " + Arrays.deepToString(args));
    }
}
