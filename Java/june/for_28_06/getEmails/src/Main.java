import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //Дано несколько списков User-ов{fFame, lName, email}, необходимо написать метод, который подготовит список всех email-ов для рассылки

        User u1 = new User("Roman", "Richert", "rr@gmail.com");
        User u11 = new User("Roman", "Richert", "rr@gmail.com");
        User u111 = new User("Roman", "Richert", "rr@gmail.com");
        User u2 = new User("Anna", "Richert", "ar@gmail.com");
        User u22 = new User("Anna", "Richert", "nyuta@gmail.com");
        User u3 = new User(null, "", null);
        User u4 = new User("Andrey", "Belov", "ab@gmail.com");
        User u5 = new User("Olaf", "Scholz", "os@gmx.de");
        User u6 = new User("Ralph", "Meurer", "meurer@info.de");
        User u7 = new User(null, null, "null@gmail.com");
        User u8 = new User("Sergey", "Perminov", "darthperminov@gmail.com");

        List<User> list1 = new ArrayList<>();
        list1.add(u1);
        list1.add(u11);
        list1.add(u2);
        list1.add(u3);
        list1.add(u4);

        List<User> list2 = new ArrayList<>();
        list2.add(u1);
        list2.add(u111);
        list2.add(u22);

        List<User> list3 = new ArrayList<>();
        list3.add(u5);
        list3.add(u6);
        list3.add(u7);
        list3.add(u8);
        list3.add(new User("Barsick", "Richert", "br@cat.meow"));

        List<List<User>> jointUserList = new ArrayList<>();
        jointUserList.add(list1);
        jointUserList.add(list2);
        jointUserList.add(list3);

        System.out.println(getEmails(jointUserList));

    }
    public static Set<String> getEmails (List<List<User>> jointUserList) {
        Set<String> emails = new HashSet<>();

        for (List<User> userList: jointUserList){
            for (User u: userList){
               if (u.getEmail() != null) emails.add(u.getEmail());
            }
        }
        return emails;
    }
}