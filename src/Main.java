import java.util.Scanner;
import java.util.Locale;

public class Main {

    public static void printMegabytesAndKilobytes (int kilobytes) {
        if (kilobytes < 1024) {
            System.out.println("Invalid value");
        } else {
            int kilobytesAfterConverting = kilobytes % 1024;
            int megabytes = (kilobytes - kilobytesAfterConverting) / 1024;
            System.out.println(kilobytes + " KB = " + megabytes + " MB and " + kilobytesAfterConverting + " KB");
        }
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter how many KB to convert: ");
        int kilobytes = scanner.nextInt();
        printMegabytesAndKilobytes(kilobytes);
    }
}