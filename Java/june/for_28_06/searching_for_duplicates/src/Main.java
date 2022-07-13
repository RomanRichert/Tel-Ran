import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //ƒан список User<name, email>, необходимо написать метод, который определит, есть ли в списке дубли.
        List<User> userList = new ArrayList<>();
        userList.add(new User("Roman Richert", "rr@gmail.com"));
        userList.add(new User("Roman Richert", "rr@gmail.com"));
        userList.add(new User("Roman Richert", "rr@gmail.com"));
        userList.add(new User("Anna Richert", "ar@gmail.com"));
        userList.add(new User("Anna Richert", "ar@gmail.com"));
        userList.add(new User("Andrey Belov", "ab@gmail.com"));
        userList.add(new User("Olaf Scholz", "os@gmx.de"));

        areThereDuplicatesInTheList(userList);

    }
    public static void areThereDuplicatesInTheList (List<User> userList){
        Set<User> userSet= new HashSet<>(userList);

        if (userSet.size() < userList.size()) System.out.println("There are duplicates in the userList");
    }
}