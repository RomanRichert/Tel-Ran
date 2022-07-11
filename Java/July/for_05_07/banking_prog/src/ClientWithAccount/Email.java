package ClientWithAccount;

public class Email implements MailDeliveryServices{
    @Override
    public String sendMail() {
        return "Send by internet";
    }
}
