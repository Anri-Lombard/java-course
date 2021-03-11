package Section3;

public class c40 {
    public static void main(String[] args) {
        double twenty = 20.00;
        double eighty = 80.00;
        double product = (twenty + eighty) * 100;
        System.out.println(product);

        double remainder = product % 40.00;
        System.out.println(remainder);

        boolean isZero = remainder == 0 ? true : false;
        System.out.println(isZero);

        if (!isZero){
            System.out.println("Got some remainder.");
        } else {
            System.out.println("No remainder.");
        }
    }
}
