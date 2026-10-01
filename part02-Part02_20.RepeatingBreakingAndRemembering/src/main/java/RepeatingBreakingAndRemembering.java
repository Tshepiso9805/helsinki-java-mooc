
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        int even = 0;
        int odd = 0;


        System.out.println("Give numbers:");

        while (true){
            int numbers = Integer.valueOf(scanner.nextLine());

            if (numbers % 2 == 0){
                even++;

            }
            if (numbers >= 0 && numbers % 2 != 0){
                odd++;

            }
            if (numbers >= 0){
                sum += numbers;
                count++;
                continue;

            } else if (numbers == -1) {
                System.out.println("Thx! Bye!");
                System.out.println("Sum: "+ sum);
                System.out.println("Numbers: " + count);
                double ave = (double) sum / count;
                System.out.println("Average: "+ ave);
                System.out.println("Even: "+ even);
                System.out.println("Odd: "+ odd);
                break;

            }

        }

    }
}
