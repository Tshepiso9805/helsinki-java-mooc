
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("File to read: ");
        String file = scanner.nextLine();

        ArrayList<Recipe> recipes = readRecipes(file);

        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");


        while (true) {
            System.out.print("Enter command: ");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;
            }

            if (command.equals("list")) {
                System.out.println("Recipes:");
                for (Recipe recipe : recipes) {
                    System.out.println(recipe);
                }
            }
            if (command.equals("find name")){
                System.out.print("Searched word: ");
                String word = scanner.nextLine();

                System.out.println("Recipes: ");
                for (Recipe recipe : recipes){
                    if (recipe.getName().contains(word)){
                        System.out.println(recipe);
                    }
                }
            }
            if (command.equals("find cooking time")) {
                System.out.print("Max cooking time: ");
                int maxTime = Integer.valueOf(scanner.nextLine());

                System.out.println("Recipes:");
                for (Recipe recipe : recipes) {
                    if (recipe.getCookingTime() <= maxTime) {
                        System.out.println(recipe);
                    }
                }
            }
            if (command.equals("find ingredient")) {
                System.out.print("Ingredient: ");
                String ingredient = scanner.nextLine();

                System.out.println("Recipes:");
                for (Recipe recipe : recipes) {
                    if (recipe.getIngredients().contains(ingredient)) {
                        System.out.println(recipe);
                    }
                }
            }
        }
    }

    public static ArrayList<Recipe> readRecipes(String file) {
        ArrayList<Recipe> recipes = new ArrayList<>();

        try (Scanner fileScanner = new Scanner(Paths.get(file))) {
            while (fileScanner.hasNextLine()) {
                String name = fileScanner.nextLine();
                int time = Integer.valueOf(fileScanner.nextLine());

                Recipe recipe = new Recipe(name, time);

                while (fileScanner.hasNextLine()) {
                    String row = fileScanner.nextLine();
                    if (row.isEmpty()) {
                        break;
                    }
                    recipe.addIngredients(row);
                }

                recipes.add(recipe);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        return recipes;
    }

}



