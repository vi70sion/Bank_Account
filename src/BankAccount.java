public abstract class BankAccount implements Account{
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() { return balance; }
    public void setBalance(double balance) { this.balance = balance; }

    @Override
    public String toString() {
        return super.toString() + balance;
    }
}
