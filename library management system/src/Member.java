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
    
    //sets the Member ID for the member
    public void setMemberId(int ID) {
        // just going to try out some validation here:
        if (ID == this.memberId) {System.out.printf("ID for this member is already %d %n", this.memberId);}
        else {
            System.out.println("");
            System.out.println("-----CHANGED MEMBER ID-----");
            System.out.println("Old Member ID: " + this.memberId);
            this.memberId = ID;
            System.out.println("New Member ID: " + this.memberId);
            System.out.println("");
        }
    }
    
    // sets the name for the member
    public void setName(String name) {
        System.out.println("");
        System.out.println("-----CHANGED MEMBER'S NAME-----");
        System.out.println("Old Name: " + this.name);
        this.name = name;
        System.out.println("New Name: " + this.name);
        System.out.println("");
    }
    
    // sets the email for the member
    public void setEmail(String email) {
        System.out.println("");
        System.out.println("-----CHANGED MEMBER'S EMAIL-----");
        System.out.println("Old Email: " + this.email);
        this.email = email;
        System.out.println("New Email: " + this.email);
        System.out.println("");
    }
    
    // sets the phone number for the member
    public void setPhoneNumber(String phoneNumber) {
        System.out.println("");
        System.out.println("-----CHANGED MEMBER'S PHONE NUMBER-----");
        System.out.println("Old Name: " + this.phoneNumber);
        this.phoneNumber = phoneNumber;
        System.out.println("New Name: " + this.phoneNumber);
        System.out.println("");
    }
}
