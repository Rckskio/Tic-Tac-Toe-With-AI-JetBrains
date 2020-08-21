import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(); //lower seed
        int b = scanner.nextInt(); //upper seed
        int n = scanner.nextInt(); // how many numbers to generate
        int k = scanner.nextInt(); // generate from 0 to k - 1;
        int difference = b - a + 1;

        int[] maximums = new int[difference];
        int[] seeds = new int[difference];
        int value;
        int minor = k;
        int seed;

        for (int i = 0; i < difference; i++) {
            int max = 0;
            seed = 0;

            Random random = new Random(a + i);
            for (int j = 0; j < n; j++) {
                value = random.nextInt(k);
                if (value > max) {
                    max = value;
                    seed = a + i;
                }
            }
            maximums[i] = max;
            seeds[i] = seed;
        }

        seed = 0;

        for (int i = 0; i < maximums.length; i++) {
            if (maximums[i] < minor) {
                minor = maximums[i];
                seed = i;
            }
        }
        System.out.println(seeds[seed]);
        System.out.println(maximums[seed]);
    }
}