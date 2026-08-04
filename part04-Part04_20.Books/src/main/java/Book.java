public class Book {
    private String title;
    private int pages;
    private String year;

    public Book(String bookTitle, int numberOfPages, String yearOfPublication){
        this.title = bookTitle;
        this.pages = numberOfPages;
        this.year = yearOfPublication;

    }

    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }

    public String getYear() {
        return year;
    }
}
