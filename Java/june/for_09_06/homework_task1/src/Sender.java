public class Sender {
    int userChoice;
    String mail;

    public Sender(int userChoice) {
        this.userChoice = userChoice;
    }

    public void send(int userChoice) {
        switch(userChoice){
            case 1:  mail = new DHL().sendMail(); break;
            case 2:  mail = new Email().sendMail(); break;
            case 3:  mail = new Pigeon().sendMail(); break;
        }
        System.out.println(mail);
    }
}
