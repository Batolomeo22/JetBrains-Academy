import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        boolean abPlus = a + b > c;
        boolean bcPlus = b + c > a;
        boolean acPlus = a + c > b;

        if (abPlus && bcPlus && acPlus) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}