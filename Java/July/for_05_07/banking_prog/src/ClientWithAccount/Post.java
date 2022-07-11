package ClientWithAccount;

public class Post implements MailDeliveryServices{
    @Override
    public String sendMail() {
        return "Send by mail";
    }
}
