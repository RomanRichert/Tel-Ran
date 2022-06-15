public class BankAccountWithPerson{
    private Person owner;
    private String iban;
    private double balance;

    public BankAccountWithPerson(Person owner, String iban, double balance) {
        this.owner = owner;
        this.iban = iban;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankAccountWithPerson{" +
                "owner=" + owner.getName() +
                ", iban='" + iban + '\'' +
                ", balance=" + balance +
                '}';
    }
}
