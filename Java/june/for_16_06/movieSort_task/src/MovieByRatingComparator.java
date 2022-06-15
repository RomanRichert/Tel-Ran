import java.util.Comparator;

public class MovieByRatingComparator implements Comparator<Movie>, MovieSortingClasses {
    @Override
    public int compare(Movie o1, Movie o2) {
        return (int) (o1.getRating()-o2.getRating())*10;
    }
}
