
public class AdvancedAstrology {

    public static void printStars(int number) {
        int i = 0;
        while (i < number){
            System.out.print("*");
            i++;
        }
        System.out.println();
        // part 1 of the exercise
    }

    public static void printSpaces(int number) {
        int i = 0;
        while(i < number){
            System.out.print(" ");
            i++;
        }
        // part 1 of the exercise
    }

    public static void printTriangle(int size) {
        int row = 1;
        while (row <= size){
            printSpaces(size -row);
            printStars(row);
            row++;
        }
        // part 2 of the exercise
    }

    public static void christmasTree(int height) {
        int row = 1;
        while (row <= height){
            printSpaces(height - row);
            printStars((row * 2) -1);
            row++;

        }
        printSpaces(height - 2);
        printStars(3);

        printSpaces(height - 2);
        printStars(3);
        // part 3 of the exercise
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
