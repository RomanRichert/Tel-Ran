public class BankAccountWithPerson extends BankAccount{
    Person owner;

    public BankAccountWithPerson(String iban, double balance, Person owner) {
        super(iban, balance);
        this.owner = owner;
    }
}
