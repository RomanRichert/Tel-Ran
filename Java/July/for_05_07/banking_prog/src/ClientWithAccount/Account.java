package ClientWithAccount;

import java.util.Objects;


public class Account{
    private final String iban;
    private double balance;

    public Account(String iban, double balance) {
        this.iban = iban;
        this.balance = balance;
    }

    public String getIban() {
        return iban;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return getIban() + ": " + getBalance();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Double.compare(account.balance, balance) == 0 && iban.equals(account.iban);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iban, balance);
    }

    protected void setBalance(double newBalance) {
        this.balance = newBalance;
    }
}
