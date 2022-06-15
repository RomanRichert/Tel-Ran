import java.util.Comparator;

public class MovieByGenreComparator implements Comparator<Movie>, MovieSortingClasses {
    @Override
    public int compare(Movie o1, Movie o2) {
        return o1.getGenre().compareTo(o2.getGenre());
    }
}
