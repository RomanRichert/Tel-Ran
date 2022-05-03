public class Main {
    public static void main(String[] args) {
        //Given arrays String[] names and int[ ] yearsOfBirthday of the same length,
        // that contains names and years of birthday of the persons.
        // Every element in yearsOfBirthday is corresponding with element at the same index in names.
        // Implement the program that prints the name and the age of all person who older that given int.
        // Than print the name and age of oldest person.
        //For example: ({“Olga”,”Oleg”,”Svetlana”,”Oleg”} , {2004,1982,2008,2010},15) ->
        //Olga 18 years
        //Oleg 40 years
        String[] names = {"Olga", "Oleg", "Svetlana", "Oleg"};
        int[] yearsOfBirth ={2004,1982,2008,2010};
        oldestPerson(names, yearsOfBirth);

    }
    public static void oldestPerson (String[] names, int[] years) {
        int i = 0;
        int min = years[0];
        int indexOfMin = 0;
        while (i < names.length) {
            System.out.println(names[i]+" "+(2022-years[i])+" years");
            min = Math.min(min, years[i]);
            if (years[i] < years[indexOfMin]) {
                indexOfMin =i;
            }
            i++;
        }

        System.out.println(names[indexOfMin] + " is " + (2022-min) + " years old, he is the oldest person.");

    }
}