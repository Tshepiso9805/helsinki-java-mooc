
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<BirdDatabase> birds = new ArrayList<>();

        while (true) {
            System.out.print("? ");
            String command = scanner.nextLine();

            if (command.equals("Quit")) {
                break;
            }

            if (command.equals("Add")) {
                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.print("Name in Latin: ");
                String latinName = scanner.nextLine();

                birds.add(new BirdDatabase(name, latinName));

            } else if (command.equals("Observation")) {
                System.out.print("Bird? ");
                String name = scanner.nextLine();

                BirdDatabase bird = findBird(birds, name);
                if (bird == null) {
                    System.out.println("Not a bird!");
                } else {
                    bird.addObservation();
                }

            } else if (command.equals("All")) {

                ArrayList<BirdDatabase> sorted = new ArrayList<>(birds);
                Collections.sort(sorted, Comparator.comparingInt(BirdDatabase::getObservations).reversed());

                for (BirdDatabase bird : sorted) {
                    System.out.println(bird);
                }

            } else if (command.equals("One")) {
                System.out.print("BirdDatabase? ");
                String name = scanner.nextLine();

                BirdDatabase bird = findBird(birds, name);
                if (bird == null) {
                    System.out.println("Not a bird!");
                } else {
                    System.out.println(bird);
                }
            }
        }
    }


    public static BirdDatabase findBird(ArrayList<BirdDatabase> birds, String name) {
        for (BirdDatabase bird : birds) {
            if (bird.getName().equals(name)) {
                return bird;
            }
        }
        return null;
    }
}



