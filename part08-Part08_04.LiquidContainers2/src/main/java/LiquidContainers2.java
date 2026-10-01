
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {

        Container first = new Container();
        Container second = new Container();
        Scanner scan = new Scanner(System.in);


        while (true) {
            System.out.println("First: " + first );
            System.out.println("Second: " + second );
            String input = scan.nextLine();



            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (command.equals("add")){
                first.add(amount);
            }
            if (command.equals("move")){
                int amountToMove = amount;

                if (amountToMove > first.contains()) {
                    amountToMove = first.contains();
                }

                first.remove(amountToMove);
                second.add(amountToMove);
            }
            if (command.equals("remove")){
                second.remove(amount);
            }
        }
    }
}
