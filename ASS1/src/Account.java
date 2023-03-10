import java.util.Date;

public class Account {
    private int id=0;
    private double balance=0;

    private double annualInterestRate=0;

    private Date dateCreated;

    public Account() {

    }

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate/100;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public double  getMonthlyInterestRate() {
        return  (annualInterestRate / 12);
    }

    public double getMonthlyInterest() {
        return (balance * getMonthlyInterestRate());
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void deposit(double amount) {
        balance += amount;
    }
}
