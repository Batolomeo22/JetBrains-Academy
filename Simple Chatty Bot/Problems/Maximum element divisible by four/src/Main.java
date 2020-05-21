import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int maxDivideBy4 = 0;

        for (int i = 0; i < n; i++) {
            int current = scanner.nextInt();
            if (current % 4 == 0 && current > maxDivideBy4) {
                maxDivideBy4 = current;
            }
        }
        System.out.println(maxDivideBy4);
    }
}