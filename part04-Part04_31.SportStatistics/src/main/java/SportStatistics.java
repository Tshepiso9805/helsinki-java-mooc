
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File: ");
        String input = scan.nextLine();

        System.out.println("Team: ");
        String team = scan.nextLine();

        int games = 0;
        int wins = 0;
        int losses = 0;

        try (Scanner fileReader = new Scanner(Paths.get(input))){
            while (fileReader.hasNextLine()){
                String read = fileReader.nextLine();

                String[] parts = read.split(",");
                String homeTeam = parts[0];
                String awayTeam = parts[1];
                int homePoints = Integer.valueOf(parts[2]);
                int awayPoints = Integer.valueOf(parts[3]);

                if (homeTeam.equals(team)) {
                    games++;
                    if (homePoints > awayPoints) {
                        wins++;
                    } else {
                        losses++;
                    }
                }
                if (awayTeam.equals(team)) {
                    games++;

                    if (awayPoints > homePoints) {
                        wins++;
                    } else {
                        losses++;
                    }
                }

            }

        } catch (Exception e) {
            System.out.println("Error: "+ e.getMessage());
        }
        System.out.println("Games: "+ games);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);

    }

}
