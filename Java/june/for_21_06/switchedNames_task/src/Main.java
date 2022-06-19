import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 1. Пусть дан список List объектов типа User{String fName, String lName, int age }.
        // Предположим, при чтение User-ов из базы данных случилась ошибка и у всех пользователей из списка поменялись
        // местами fName и lName. Необходимо написать метод, который исправит данную ситуацию.
        //
        // 2. Пусть дан список List объектов типа User{String fName, String lName, int age }.
        // Необходимо исключить из списка всех пользователей моложе 18 лет.

        List<User> userList = new ArrayList<>();
        userList.add(new User("Richert", "Roman", 27));
        userList.add(new User("Richert", "Anna", 24));
        userList.add(new User("Rogov", "Stephen", 10));
        userList.add(new User("Benerscheidt", "Tristan", 9));
        userList.add(new User("Richert", "Barsick", 2));

        System.out.println(switchNamesInUserList(userList));                     // 1 задача
        System.out.println("-----------------------------");
        System.out.println(removeUsersUnder18(switchNamesInUserList(userList))); // 2 задача

    }

    public static List<User> switchNamesInUserList (List<User> userList){
        String tmp;

        for (User u: userList) {
            tmp = u.getlName();
            u.setlName(u.getfName());
            u.setfName(tmp);
        }

        return userList;
    }

    public static List<User> removeUsersUnder18 (List<User> userList){
        userList.removeIf(u -> u.getAge() < 18);

        return userList;
    }
}