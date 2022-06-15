import java.util.Comparator;

public class MovieByNameComparator implements Comparator<Movie>, MovieSortingClasses {
    @Override
    public int compare(Movie o1, Movie o2) {
       return o1.getName().compareTo(o2.getName());
    }
}
