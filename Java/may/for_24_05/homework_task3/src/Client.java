public class Client {
    String name;
    String lastname;
    int locator_id;
    String city;

    public Client (String name, String lastname, int locator_id, String city){
        this.name = name;
        this.lastname = lastname;
        this.locator_id = locator_id;
        this.city = city;
    }

    public void printLocator(Locator id){
        switch (locator_id) {
            case 1:
                System.out.println(id.toString());
                break;
            case 2:

        }

    }
}
