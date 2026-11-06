public class Member {
    private int memberId;
    private String name;
    private String email;
    private String phoneNumber;
    
    // constructor
    public Member(int memberId, String name, String email, String phoneNumber) {
        this.memberId = memberId;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    
    public void getMemberDetails() {
        System.out.println("");
        System.out.println("-----MEMBER DETAILS-----");
        System.out.printf("Member ID: %d %n", memberId);
        System.out.printf("Name: %s %n", name);
        System.out.printf("Email: %s %n", email);
        System.out.printf("Phone Number: %s %n", phoneNumber);
        System.out.println("");
    }
    
    public void setMemberId(int ID) {
        System.out.println("");
        System.out.println("-----CHANGED MEMBER ID-----");
        System.out.println("Old Member ID: " + this.memberId);
        this.memberId = ID;
        System.out.println("New Member ID: " + this.memberId);
        System.out.println("");
    }
}
