
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;

        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");

            //System.out.print("> ");
            String input = scan.nextLine();

            if (input.equals("quit")) {
                break;
            }
            if (input.startsWith("add ")){
                String[] parts = input.split(" ");
                int amount = Integer.valueOf(parts[1]);

                if (amount >= 0) {
                    first += amount;
                    if (first > 100){
                        first = 100;
                    }
                }
            }
            if (input.startsWith("move ")){
                String[] parts = input.split(" ");
                int amount = Integer.valueOf(parts[1]);

                if (amount >= 0){
                    int actualAmount = Math.min(amount, first);
                    actualAmount = Math.min(actualAmount, 100 - second);

                    second += actualAmount;
                    first -= actualAmount;

                }
            }
            if (input.startsWith("remove ")){

                String[] parts = input.split(" ");
                int amount = Integer.valueOf(parts[1]);

                if (amount >= 0){
                    int actualAmount = Math.min(amount, second);
                        second -= actualAmount;
                }
            }
        }
    }
}
