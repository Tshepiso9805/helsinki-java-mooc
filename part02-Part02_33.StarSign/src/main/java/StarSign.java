
public class StarSign {

    public static void main(String[] args) {

        
        //The tests are not checking the main, so you can modify it freely.
        //NB: If the tests don't seem to pass, you should try the methods here
        //in the main to make sure they print the correct shapes!
        
        printStars(3);
        System.out.println("\n---");  // printing --- between the shapes
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

    public static void printStars(int number) {
        int i = 1;
        while (i <= number){
            System.out.print("*");
            i++;
        }
        System.out.println("");
        // first part of the exercise
    }

    public static void printSquare(int size) {
        int row = 0;
        while (row < size){
            printStars(size);
            row++;
        }
        System.out.println("");
        // second part of the exercise
    }

    public static void printRectangle(int width, int height) {
        int row = 0;
        while (row < height){
            printStars(width);
            row++;
        }
        System.out.println("");
        // third part of the exercise
    }

    public static void printTriangle(int size) {
        int row = 1;
        while (row <= size){
            printStars(row);
            row++;
        }
        System.out.println("");
        // fourth part of the exercise
    }
}
