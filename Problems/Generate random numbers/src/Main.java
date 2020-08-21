import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        Random random = new Random(a + b);
        int intervalLength = b - a + 1;
        int result = 0;

        for (int i = 0; i < n; i++) {
            result += random.nextInt(intervalLength) + a;
        }
        System.out.println(result);



    }
}