import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        int count = 0;
        int maxNum = 0;
        Scanner scanner = new Scanner(System.in);
        int all = scanner.nextInt();
        while (count < all) {
            int cur = scanner.nextInt();
            if (cur % 4 == 0 && cur > maxNum) {
                maxNum = cur;
            }
            count++;
        }

        System.out.println(maxNum);
    }
}