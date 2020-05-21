import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        String upperInput = input.toUpperCase();
        char firstLetter = upperInput.charAt(0);
        
        System.out.println(firstLetter == 'J');
    }
}
