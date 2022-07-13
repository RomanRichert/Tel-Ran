import java.util.Objects;

public class User {
   private final String fName;
   private final String lName;
   private String email;

    public User(String fName, String lName, String email) {
        this.fName = fName;
        this.lName = lName;
        this.email = email;
    }

    public String getfName() {
        return fName;
    }


    public String getlName() {
        return lName;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return fName+" "+lName+": "+email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(fName, user.fName) && Objects.equals(lName, user.lName) && Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fName, lName, email);
    }
}
