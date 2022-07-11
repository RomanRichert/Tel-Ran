package ClientWithAccount;

import java.util.Objects;

public class Client {
    private final String fName;
    private final String lName;
    private Account account;
    private String status;

    public Client(String fName, String lName, Account account, String status) {
        this.fName = fName;
        this.lName = lName;
        this.account = account;
        this.status = status;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public Account getAccount() {
        return account;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        if (fName != null && lName != null && account.getIban() != null && status != null){
        return fName +" "+ lName + " ("+ status + ")";
        } else return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(fName, client.fName) && Objects.equals(lName, client.lName) && Objects.equals(account, client.account) && Objects.equals(status, client.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fName, lName, account, status);
    }

    public void addPercentAndInform() {
        double percent = 0;
        double bonus = 50;

        if (fName != null && lName != null && account.getIban() != null && account.getBalance() > 0 && (status.equals("Private") || status.equals("Entity") || status.equals("VIP"))) {
            if (status.equals("Private") || status.equals("VIP")) {
                percent = this.account.getBalance()*0.07/12;
                this.account.setBalance(this.account.getBalance() + percent);
                if (status.equals("VIP")) this.account.setBalance(this.account.getBalance() + bonus);
            } else if (account.getBalance() >= 10000){
                percent = this.account.getBalance()*0.12/12;
                this.account.setBalance(this.account.getBalance() + percent);
            } else System.out.println("You have to keep at least 10 000 ˆ on your account to get the taxes");


            System.out.println(this + "\n" + this.account.getBalance() + " (Taxes: " +  percent +")");
            if (status.equals("VIP")) System.out.println("Your VIP bonus: "+bonus);

            if (status.equals("Private") || status.equals("Entity") || status.equals("VIP")) new Sender().send(status);
            System.out.println("------------------------------");
        } else if (account.getBalance() <= 0) System.out.println("You don't have enough money on your account :'(");
            else System.out.println("This clients data is corrupted\n" +
                "------------------------------");
    }


}
