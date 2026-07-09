
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many days would you like to convert to seconds? ");

        int inp = Integer.valueOf(scanner.nextLine());
        int secInADay = 86400;
        int total = inp * secInADay;
        System.out.println(total);

        // Write your program here

    }
}
