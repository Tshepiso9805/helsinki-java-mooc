
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int firstN = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the second number:");
        int secN = Integer.valueOf(scanner.nextLine());


        System.out.println(firstN +" + " + secN + " = " + (firstN + secN));
        System.out.println(firstN +" - " + secN + " = " + (firstN - secN));
        System.out.println(firstN +" * " + secN + " = " + (firstN * secN));
        System.out.println(firstN +" / " + secN + " = " + (1.0 *firstN / secN));

        // Write your program here

    }
}
