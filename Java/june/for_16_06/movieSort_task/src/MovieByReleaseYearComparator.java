import java.util.Comparator;

public class MovieByReleaseYearComparator implements Comparator<Movie>, MovieSortingClasses {
    @Override
    public int compare(Movie o1, Movie o2) {
        return o1.getReleaseYear()-o2.getReleaseYear();
    }
}
