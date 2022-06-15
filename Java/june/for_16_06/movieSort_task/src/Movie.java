public class Movie<Movie>{
    private String name;
    private String genre;
    private double rating;
    private int releaseYear;

    public Movie(String name, String genre, double rating, int releaseYear) {
        this.name = name;
        this.genre = genre;
        this.rating = rating;
        this.releaseYear = releaseYear;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public double getRating() {
        return rating;
    }

    public int getReleaseYear() {
        return releaseYear;
    }



    @Override
    public String toString() {
        return name + " ("+releaseYear+")" + "| " + genre  + "| Rating IMDb: " + rating;
    }
}
