public class Person implements Comparable<Person>{
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

   /* public String compareTo (Person person) {
        if (this.age > person.age){
            return this.name +" is older than "+person.name;
        }
        else return this.name +" is younger than "+person.name;
    }*/

    @Override
    public int compareTo(Person o) {
        return this.age - o.age;
    }



}
