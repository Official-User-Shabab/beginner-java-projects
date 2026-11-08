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
        
        System.out.printf("A new book object has been made! Book ID: %d %n", bookId);
        System.out.println("");
    }
    
    // fully lists out book's details
    public void getBookDetails() {
        System.out.println("");
        System.out.println("-----BOOK DETAILS-----");
        System.out.printf("Book ID: %d %n", bookId);
        System.out.printf("Title: %s %n", title);
        System.out.printf("Author: %s %n", author);
        System.out.printf("Genre: %s %n", genre);
        System.out.printf("Availability: %b %n", available);
        System.out.println("");
    }
    
    public boolean isAvailable() {return available;}
    
    // sets the ID for book
    public void setBookId(int BookId) {
        System.out.println("");
        System.out.println("-----CHANGED BOOK ID-----");
        System.out.println("Old Book ID: " + this.bookId);
        this.bookId = bookId;
        System.out.println("New Book ID: " + this.bookId);
        System.out.println("");
    }
    
    // sets the title for book
    public void setTitle(String title) {
        System.out.println("");
        System.out.println("-----CHANGED BOOK'S TITLE-----");
        System.out.println("Old Title: " + this.title);
        this.title = title;
        System.out.println("New Title: " + this.title);
        System.out.println("");
    }
    
    
    // sets the author for book
    public void setAuthor(String author) {
        System.out.println("");
        System.out.println("-----CHANGED BOOK'S AUTHOR-----");
        System.out.println("Old Author: " + this.author);
        this.author = author;
        System.out.println("New Author: " + this.author);
        System.out.println("");
    }
     
    
    // sets the genre for book
    public void setGenre(String genre) {
        System.out.println("");
        System.out.println("-----CHANGED BOOK'S GENRE-----");
        System.out.println("Old Genre: " + this.genre);
        this.genre = genre;
        System.out.println("New Genre: " + this.genre);
        System.out.println("");
    }
    
    // sets availability for book
    public void setAvailability(boolean available) {
        System.out.println("");
        System.out.println("-----CHANGED BOOK'S AVAILABILITY-----");
        System.out.println("Old Available: " + this.available);
        this.available = available;
        System.out.println("New Available: " + this.available);
        System.out.println("");
    }
}
