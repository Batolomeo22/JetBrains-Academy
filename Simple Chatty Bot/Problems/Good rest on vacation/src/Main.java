import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int durations = scanner.nextInt();
        int foodCostPerDay = scanner.nextInt();
        int flightOneWay = scanner.nextInt();
        int costHotelOneNight = scanner.nextInt();

        int costAll = foodCostPerDay * durations
                      + flightOneWay * 2
                      + costHotelOneNight * (durations -1);
        System.out.println(costAll);
    }
}