
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String longestName = "";
        int sum = 0;
        int count = 0;

        while (true){
            String line = scanner.nextLine();
            if (line.equals("")){
                break;
            }

            String[] parts = line.split(",");
            String name = parts[0];
            int birthYear = Integer.valueOf(parts[1]);

            if (name.length() > longestName.length()){
                longestName = name;
            }
            sum += birthYear;
            count++;
        }
        double average = (double) sum/count;

        System.out.println("Longest name: "+ longestName);
        System.out.println("Average of the birth years: "+ average);


    }
}
