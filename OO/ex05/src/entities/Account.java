package entities;

public class Account {

    private int accNumber;
    private String accName;
    private double value;

    public Account(int accNumber, String accName, double initalDeposit) {
        this.accNumber = accNumber;
        this.accName = accName;
        deposit(initalDeposit);
    }

    public Account(int accNumber, String accName) {
        this.accNumber = accNumber;
        this.accName = accName;
    }

    public double getValue() {
        return value;
    }

    public int getAccNumber() {
        return accNumber;
    }

    public String getAccName() {
        return accName;
    }

    public void setAccName(String accName) {
        this.accName = accName;
    }

    public void deposit (double deposit) {
        this.value += deposit;
    }

    public void withdraw(double withdraw) {
        this.value -= withdraw + 5.0;
    }

    public String toString() {
        return "Account " + accNumber + ", Holder: " + accName + ", Balance: $ " + value;
    }
}
