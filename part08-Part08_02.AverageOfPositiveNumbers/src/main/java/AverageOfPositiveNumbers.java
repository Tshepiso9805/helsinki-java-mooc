
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int total = 0;
        int count = 0;

        while (true){
            int input = Integer.valueOf(scanner.nextLine());

            if (input == 0){
                break;
            }
            if (input > 0){
                total += input;
                count++;

            }

        }
        if (total <= 0){
            System.out.println("Cannot calculate the average");
        }else {
            double average = (double) total/count;
            System.out.println(average);
        }

    }
}
