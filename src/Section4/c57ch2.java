package Section4;

public class c57ch2 {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(1024);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0){
            System.out.println("Invalid Value");
            return;
        }
        int megaBytes = kiloBytes / 1000;
        int kiloBytesLeft = kiloBytes % 1000;
        System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + kiloBytesLeft + " KB");
    }
}
