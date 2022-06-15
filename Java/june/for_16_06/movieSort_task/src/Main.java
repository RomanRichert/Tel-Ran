import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Movie> movieList = new ArrayList<>();
            movieList.add(new Movie("The Shawshank Redemption                         ", "Drama                   ", 9.3, 1994));
            movieList.add(new Movie("The Godfather                                    ", "Crime, drama            ", 9.2, 1972));
            movieList.add(new Movie("The Dark Knight                                  ", "Action, crime, drama    ", 9.0, 2008));
            movieList.add(new Movie("The Godfather Part II                            ", "Crime, drama            ", 9.0, 1974));
            movieList.add(new Movie("12 Angry Men                                     ", "Crime, Drama            ", 9.0, 1957));
            movieList.add(new Movie("Schindler's List                                 ", "Biography,drama, history", 9.0, 1993));
            movieList.add(new Movie("The Lord of the Rings: The Return of the King    ", "Action, adventure, drama", 9.0, 2003));
            movieList.add(new Movie("Pulp Fiction                                     ", "Crime, drama            ", 8.9, 1994));
            movieList.add(new Movie("The Lord of the Rings: The Fellowship of the Ring", "Action, adventure, drama", 8.8, 2001));
            movieList.add(new Movie("Il buono, il brutto, il cattivo                  ", "Adventure, western      ", 8.8, 1966));

        Movie[] movieArray = movieListToMovieArray(movieList);
        HowToSort newSort = new HowToSort();

        System.out.println("How do you want to sort your movie list? Type: \n " +
                "1 - to sort by the name \n " +
                "2 - to sort by the genre \n " +
                "3 - to sort by the rating IMDb \n " +
                "4 - to sort by the release year");


        Arrays.sort(movieArray, newSort.movieSort(sc.nextInt()));
        print(movieArray);


    }

    public static void print(Movie[] movieArr){
        for (Movie u:movieArr ) {
            System.out.println(u);
        }
    }

    public static Movie[] movieListToMovieArray(List<Movie> movieList) {
        Movie[] movieArr = new Movie[movieList.size()];
        int i = 0;

       while (i < movieList.size()) {
         movieArr[i] = movieList.get(i);
         i++;
       }
        return movieArr;
    }


}