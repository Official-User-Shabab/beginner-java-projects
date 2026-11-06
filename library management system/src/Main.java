class Main {
    public static void main(String[] args) {
        System.out.println("Program started");
        
        Book book1 = new Book(000001, "First Book", "MeIsAuthor", "Non-fiction", true);
        Member member1 = new Member(000, "MyName", "email@email.com", "09990");
        member1.getMemberDetails();
        member1.setMemberId(863);
        member1.getMemberDetails();
    }
}
