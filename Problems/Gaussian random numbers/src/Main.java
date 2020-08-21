import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int n = scanner.nextInt();
        double m = scanner.nextDouble();
        double gaussian;
        boolean condition = true;

        for (int i = k; condition; i++) {
            Random random = new Random(i);
            for (int j = 0; j < n; j++) {
                gaussian = random.nextGaussian();
                if (gaussian > m) {
                    break;
                } else if (j == n - 1) {
                    System.out.print(i);
                    condition = false;
                    break;
                }
            }
        }


    }
}