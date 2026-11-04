public class Book {
    private int bookId;
    private String title;
    private String author;
    private String genre;
    private boolean available;
    
    // constructor
    public Book(int bookId, String title, String author, String genre, boolean available) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.available = available;
        
        System.out.printf("A new book object has been made! Title: %s %n", title);
    }
    
    public String getBookDetails() {return "hi";}
    public boolean isAvailable() {return true;}
    public void setAvailable(boolean status) {}
}
