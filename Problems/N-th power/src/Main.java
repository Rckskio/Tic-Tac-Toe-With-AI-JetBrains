import java.util.Scanner;

public class Main {

    public static double pow(double a, long n) {
        if (n == 1) {
            return a;
        }
        if (n == 0) {
            return 1;
        }
        if (n == 2) {
            return a * a;
        }
        if (n % 2 == 0) {
            return pow(pow(a, 2), n / 2);
        }
        return a * pow(a, n - 1);
    }
    // Other solution from jetbrains - better
    // public static double pow(double a, long n) {
    //     if (n == 0) {
    //         return 1;
    //     }
    //     if (n % 2 == 0) {
    //         return pow(a * a, n / 2);
    //     } else {
    //         return pow(a, n - 1) * a;
    //     }
    // }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final double a = Double.parseDouble(scanner.nextLine());
        final int n = Integer.parseInt(scanner.nextLine());
        System.out.println(pow(a, n));
    }
}