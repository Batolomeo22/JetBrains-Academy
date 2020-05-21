import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int input = scanner.nextInt();
        boolean result = (input > 0) && (input < 10);

        System.out.println(result);
    }
}