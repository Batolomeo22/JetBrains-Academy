import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        double m = scanner.nextInt();
        double p = 1 + scanner.nextInt() / 100.0;
        int k = scanner.nextInt();
        int countYear = 0;
        while (m < k) {
            m = m * p;
            countYear++;
        }

        System.out.println(countYear);
    }
}
