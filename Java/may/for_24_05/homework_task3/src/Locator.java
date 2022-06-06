public class Locator {
    int locator_id;
    String phone;
    String email;

    public Locator (int locator_id, String phone, String email) {
        this.locator_id = locator_id;
        this.phone = phone;
        this.email = email;
    }

    public String toString(){
        return "Phone: " + this.phone + ", email: "+this.email;
    }
}
