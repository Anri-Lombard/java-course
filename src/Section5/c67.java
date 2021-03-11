package Section5;

public class c67 {
    public static void main(String[] args) {
        int count = 0;
        int total = 0;

        for (int i=0;i<=1000;i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("Number = " + i);
                count += 1;
                total += i;
                if (count == 5) {
                    break;
                }
            }
        }
        System.out.println("Total = " + total);
    }


}
