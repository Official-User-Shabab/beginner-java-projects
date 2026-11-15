import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        System.out.println("");
        System.out.println("-------------PROGRAM STARTED-------------");
        System.out.println("");
        
        Book book1 = new Book(0001, "First Book", "MeIsAuthor", "Non-fiction", true);
        Book book2 = new Book(0002, "Not First Book", "MeWasAuthor", "Noction", false);
        Book book3 = new Book(0003, "Pre-Fourth Book", "IAuthor", "Genre3", true);
        
        /*
        Member member1 = new Member(000, "MyName", "email@email.com", "09990");
        member1.getMemberDetails();
        member1.setMemberId(000);
        member1.getMemberDetails();
        
        Member member2 = new Member(543, "NAME", "MAIL@MAILING.com", "8420");
        member2.getMemberDetails();
        member2.setEmail("mail@mailing.com");
        */
        
        ArrayList<Book> books = new ArrayList<>();
        
        books.add(book1);
        books.add(book2);
        books.add(book3);
        
        System.out.println();
        
        System.out.println(books); // it prints out the address where object stored
        
        System.out.println();
        
        for (Book book: books) {
            book.getBookDetails();  // but this actually gets book details since i had a method defined for the task
        }
        
        System.out.println();
        
        books.remove(0); // this should remove the first item in collection books
        
        System.out.println(books); // it prints out the address where object stored
        
        // Searching for an item in collection books
        
        System.out.println("Working?");
        
        Book foundBook = null;
        for (Book book : books) {
        int num = book.getBookId();
        System.out.println(num);
            if (num == 0002) {
                foundBook = book;
                System.out.println("I found it!!!");
                break;
            }
        }
        
        System.out.println(foundBook);
        
    }
}
