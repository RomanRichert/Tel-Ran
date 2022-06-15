import java.util.Comparator;
import java.util.Scanner;

public class HowToSort {
    Comparator comparator;


public Comparator movieSort(int userChoice){
    Scanner sc = new Scanner(System.in);

    switch(userChoice){
        case 1:  comparator = new MovieByNameComparator(); break;
        case 2:  comparator = new MovieByGenreComparator(); break;
        case 3:  comparator = new MovieByRatingComparator(); break;
        case 4:  comparator = new MovieByReleaseYearComparator(); break;
        default:
            System.out.println("Please choose the sort method!");
            movieSort(sc.nextInt());

    }
    return comparator;
}
}
