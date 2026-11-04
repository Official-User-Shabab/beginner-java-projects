public class Loan {
    private int loanId;
    private Book book;
    private Member member;
    private LocalDate borrowDate;
    private LocalDate dueDate;
    private LocalDate returnDate;
    
    public void createLoan() {}
    public void completeLoan() {}
    public boolean isOverdue() {return true;}
}
