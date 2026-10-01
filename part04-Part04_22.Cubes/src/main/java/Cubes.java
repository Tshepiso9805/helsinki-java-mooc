
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            String input = scanner.nextLine();
            if (input.contains("end")){
                break;
            }
            int cubed = Integer.valueOf(input);
            System.out.println(cubed * cubed * cubed);
        }

    }
}
