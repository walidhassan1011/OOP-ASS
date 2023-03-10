public class Main {
    public static void main(String[] args) {
        // quetsion 9
        // you need to make a new object of the class test (new test = TEST) or make the class static
        //================================================================================================
        Account account = new Account(1122, 20000, 4.5);
        account.withdraw(2500);
        account.deposit(3000);
        System.out.println("Balance: " + account.getBalance());
        System.out.println("Monthly Interest: " + account.getMonthlyInterest());
        System.out.println("Date Created: " + account.getMonthlyInterest());
    }

}