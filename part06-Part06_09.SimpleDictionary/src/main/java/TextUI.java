import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary simpleDictionary;

    public TextUI(Scanner scanner1, SimpleDictionary simpleDictionary1) {
        this.scanner = scanner1;
        this.simpleDictionary = simpleDictionary1;

    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();

            if (command.equals("end")) {
                System.out.println("Bye bye!");
                break;
            } else if (command.equals("add")) {
                System.out.print("Word: ");
                String word = scanner.nextLine();
                System.out.print("Translation: ");
                String translation = scanner.nextLine();
                simpleDictionary.add(word, translation);
            } else if (command.equals("search")) {
                System.out.print("To be translated: ");
                String wordSearch = scanner.nextLine();
                String translation = simpleDictionary.translate(wordSearch);
                if (translation == null) {
                    System.out.println("Word " + wordSearch + " was not found");
                } else {
                    System.out.println("Translation: " + translation);
                }
            } else {
                System.out.println("Unknown Command");
            }

        }
    }

}


