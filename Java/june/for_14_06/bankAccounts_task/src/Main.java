import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Given a list of Person (String name, List<BankAccount> accounts) .
        // BankAccount is the class with following fields: String iban, double balance.
        // Create class BankAccountWithOwner (Person owner, String iban, double balance).
        // Implement the method that returns the List of BankAccountWithOwner.

        List<BankAccount> accounts1 = new ArrayList<>();
        accounts1.add(new BankAccount("DE12 5201 0519 0748 4198 90", 989.57));
        accounts1.add(new BankAccount("AT61 19043 00234569773", 0.0));
        accounts1.add(new BankAccount("DE90123456781234567890", 150000.02));
        Person person1 = new Person("Roman", accounts1);

        List<BankAccount> accounts2 = new ArrayList<>();
        accounts2.add(new BankAccount("AT 96 20111 123412341234", 23584.66));
        accounts2.add(new BankAccount("AT981234512345678901", 10.0));
        Person person2 = new Person("Anna", accounts2);



    }
}