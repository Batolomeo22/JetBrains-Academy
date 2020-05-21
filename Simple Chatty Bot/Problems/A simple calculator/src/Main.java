import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        String fnStr = scanner.next();
        long fn = Long.parseLong(fnStr);
        String operation = scanner.next();
        String snStr = scanner.next();
        long sn = Long.parseLong(snStr);

        switch (operation) {
            case "+":
                System.out.println(fn + sn);
                break;
            case "-":
                System.out.println(fn - sn);
                break;
            case "/":
                if (sn == 0) {
                    System.out.println("Division by 0!");
                    break;
                }
                System.out.println(fn / sn);
                break;
            case "*":
                System.out.println(fn * sn);
                break;
            default:
                System.out.println("Unknown operator");
        }
    }
}
