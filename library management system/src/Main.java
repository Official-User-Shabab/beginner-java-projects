import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        System.out.println("");
        System.out.println("-------------PROGRAM STARTED-------------");
        System.out.println("");
        
        /*
        Book book1 = new Book(0001, "First Book", "MeIsAuthor", "Non-fiction", true);
        Book book2 = new Book(0002, "Not First Book", "MeWasAuthor", "Noction", false);
        Book book3 = new Book(0003, "Pre-Fourth Book", "IAuthor", "Genre3", true);
        */
        
        
        Member member1 = new Member(000, "MyName", "email@email.com", "09990");
        Member member2 = new Member(543, "NAME", "MAIL@MAILING.com", "8420");
        
        // member1.getMemberDetails();
        member1.setMemberId(000);
        
        // member2.getMemberDetails();
        member2.setEmail("mail@mailing.com");
        
        /*
        ArrayList<Book> books = new ArrayList<>();
        
        books.add(book1);
        books.add(book2);
        books.add(book3);
        */
        
        System.out.println();
        
        ArrayList<Member> members = new ArrayList<>();
        
        members.add(member1);
        members.add(member2);
        
        members.remove(0); // removes first member
        
        boolean result1 = members.contains(member1);
        boolean result2 = members.contains(member2); // practising .contains() method
        
        System.out.println(result1);
        System.out.println(result2);
        
        for (Member member : members) {
            member.getMemberDetails();
        }
        
        System.out.println(members.size()); // this just gave length/size of arraylist
    }
}
