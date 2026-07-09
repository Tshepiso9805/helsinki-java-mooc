
import java.util.Scanner;

public class AdditionFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number:");
        int firstN = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the second number:");
        int secN = Integer.valueOf(scanner.nextLine());

        int sum = firstN + secN;

        System.out.println(firstN +" + " + secN + " = " + sum);

        // write your program here

    }
}
