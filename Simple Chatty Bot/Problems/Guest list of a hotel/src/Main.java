// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String guest1 = scanner.nextLine();
        guest1 = checkLast(guest1);
        String guest2 = scanner.nextLine();
        guest2 = checkLast(guest2);
        String guest3 = scanner.nextLine();
        guest3 = checkLast(guest3);
        String guest4 = scanner.nextLine();
        guest4 = checkLast(guest4);

        String allGuest = guest1 + " " + guest2 + " " + guest3 + " " + guest4;
        String[] allGuestArr = allGuest.split(" ");

        for(int i = allGuestArr.length;i > 0;i--){
            System.out.println(allGuestArr[i-1]);
        }
    }

    public static String checkLast(String guest) {
        String last= guest.charAt(guest.length()-1)+"";
        if(" ".equals(last)){
            return guest.substring(0,guest.lastIndexOf(" ")) ;
        }
        return guest;
    }
}