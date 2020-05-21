import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nextInt = scanner.nextInt();
        int i;
        boolean ascflag = true;
        boolean descflag = true;

        while (true) {
            i = nextInt;
            nextInt = scanner.nextInt();
            if (nextInt == 0) {
                break;
            }
            if (descflag && i < nextInt) {
                descflag = false;
                continue;
            }
            if (ascflag && i > nextInt) {
                ascflag = false;
                continue;
            }
            if (!ascflag && !descflag) {
                break;
            }
        }

        System.out.println(ascflag || descflag);
        // put your code here
    }
}
