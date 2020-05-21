import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        // a between b and c
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        // 优先级 >= <= 高于 && 高于 ||
        System.out.println(a >= b && a <= c || a >= c && a <= b);
    }
}