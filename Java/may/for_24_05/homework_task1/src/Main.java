
public class Main {
    public static void main(String[] args) {
        // 1. Given two arrays. The first is String[n] students – names of students.
        // The second is int[n][] grades – the array of grades for student homework.
        // Every row of grades array is one student's grades (grades[k] is the grades of students[k]).
        // Note, that each student has a different number of grades. You should implement the program that finds and
        // displays the student with highest GPA and the score.
        //Example:
        //{Jack, Nick} { { 3,4,2}, { 5,5,5,4} } -> Nick 4.75

        // 2. Implement the previous task in OOP style. Create the Student class with name and grade fields.
        // Tip: grade should be an array.
        String[] names = {"Jack", "Nick"};
        int[][] grades = { { 3,4,2}, { 5,5,5,4} };
        int k = 1; // number of the student
        double gpa = 0;
        Student numberK = null;
        Student numberK2;


      while(k < grades.length) {                               // Перебор студентов
          numberK = new Student(names[k],grades[k]);
          numberK2 = new Student(names[k-1],grades[k-1]);

          if (highestGPAinOOP(numberK, numberK2) > gpa) {
           gpa = highestGPAinOOP(numberK, numberK2);
          }
          k++;
      }
      k =0;
      while (k < grades.length) {                              // Печать
          if (gpa == numberK.gpa()) {
              numberK.print();
              break;
          }
          k++;
      }


    }

    public static double highestGPAinOOP (Student numberK, Student numberK2) {  // Метод сравнения среднего балла
        int k = 0;                                                              // у двух студентов
        double gpa = 0;
       while (k < numberK.grades.length){
            if (numberK.gpa() > numberK2.gpa() && numberK.gpa() > gpa) {
                gpa = numberK.gpa();
            }
            k++;
        }
       return gpa;
    }

}