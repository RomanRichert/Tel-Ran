public class Student {

    String name;
    int[] grades;

    public Student (String name, int[] grades) {
        this.name = name;
        this.grades = grades;
    }

    public double gpa() {
        double sum = 0;
        int i = 0;
        while (i < grades.length) {
            sum = sum + grades[i];
            i++;
        }
        return sum/ grades.length;
    }

    public void print() {
        System.out.println(this.name +" "+ gpa());
    }
}
