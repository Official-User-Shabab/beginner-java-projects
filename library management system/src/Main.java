class Main {
    public static void main(String[] args) {
        System.out.println("");
        System.out.println("-------------PROGRAM STARTED-------------");
        System.out.println("");
        
        Book book1 = new Book(000001, "First Book", "MeIsAuthor", "Non-fiction", true);
        Member member1 = new Member(000, "MyName", "email@email.com", "09990");
        member1.getMemberDetails();
        member1.setMemberId(000);
        member1.getMemberDetails();
        
        Member member2 = new Member(543, "NAME", "MAIL@MAILING.com", "8420");
        member2.getMemberDetails();
        member2.setEmail("mail@mailing.com");
    }
}
