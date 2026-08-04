import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Book>books = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.print("Title: ");
            String name = scanner.nextLine();
            if (name.isEmpty()){
                break;
            }

            System.out.print("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());

            System.out.print("Publication year: ");
            String year = scanner.nextLine();

            books.add(new Book(name, pages, year));
        }

        System.out.println();

        System.out.print("What information will be printed? ");
        String input = scanner.nextLine();

        for (Book book: books){
            if (input.contains("everything")){
                System.out.println(book.getTitle() + ", " + book.getPages()+ " pages" + ", "+ book.getYear());
            }
            if (input.contains("name")){
                System.out.println(book.getTitle());
            }
        }

    }
}
