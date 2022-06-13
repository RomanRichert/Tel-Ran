import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        people.add(new Person("Johann", 62));
        people.add(new Person("Roman", 27));
        people.add(new Person("Anna", 24));
        people.add(new Person("Svetlana", 56));

        int i= 0;


        Person[] allPeople = new Person[1];
        while (i < allPeople.length) {
            allPeople = people.toArray(new Person[0]);

            System.out.println(allPeople[i].getName());
            i++;
        }
        Arrays.sort(allPeople);



        //System.out.println(allPeople.toString());



    }

}

