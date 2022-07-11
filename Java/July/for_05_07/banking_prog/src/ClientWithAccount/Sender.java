package ClientWithAccount;

public class Sender {



    public void send(String clientStatus) {
        String mail;

        switch(clientStatus){
            case "VIP":  mail = new Post().sendMail(); break;
            case "Entity":
            case "Private":
                mail = new Email().sendMail(); break;
            default: mail = null;
        }

        System.out.println(mail);
    }
}
