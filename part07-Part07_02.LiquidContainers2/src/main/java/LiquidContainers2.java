
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Container first = new Container();
        Container second = new Container();
        Scanner scan = new Scanner(System.in);



        while (true) {
            System.out.println("First: " + first.toString() );
            System.out.println("Second: " + second.toString());

            //System.out.print("> ");
            String input = scan.nextLine();

            if (input.equals("quit")) {
                break;
            }
            if (input.startsWith("add ")){
                String[] parts = input.split(" ");
                int amount = Integer.valueOf(parts[1]);

                if (amount >= 0) {
                    first.add(amount);
                }
            }
            if (input.startsWith("move ")){
                String[] parts = input.split(" ");
                int amount = Integer.valueOf(parts[1]);

                if (amount >= 0){
                    int actual = Math.min(amount, first.contains());
                    first.remove(actual);
                    second.add(actual);

                }
            }
            if (input.startsWith("remove ")){

                String[] parts = input.split(" ");
                int amount = Integer.valueOf(parts[1]);

                second.remove(amount);
            }
        }
    }

}
