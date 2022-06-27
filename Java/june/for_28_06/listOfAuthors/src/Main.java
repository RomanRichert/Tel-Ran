import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //Дан лист Book{String title, Author author}. Естественно, один автор Author{firstName, lastName} может быть автором нескольких книг.
        // Необходимо получить список всех авторов.

        List<Book> bookList = new ArrayList<>();

        bookList.add(new Book("War of the Ancients: The Well of Eternity", new Author("Richard", "Knaak")));
        bookList.add(new Book("War of the Ancients: The Demon Soul", new Author("Richard", "Knaak")));
        bookList.add(new Book("Warcraft: Lord of the Clans", new Author("Christie", "Golden")));
        bookList.add(new Book("World of Warcraft: Rise of the Horde", new Author("Christie", "Golden")));
        bookList.add(new Book("World of Warcraft: Beyond the Dark Portal", new Author("Christie", "Golden")));
        bookList.add(new Book("World of Warcraft: Beyond the Dark Portal", new Author("Christie", "Golden")));
        bookList.add(new Book("World of Warcraft: Beyond the Dark Portal", new Author("Christie", "Golden")));
        bookList.add(new Book("Warcraft: The Last Guardian", new Author("Jeff", "Grubb")));

        System.out.println(getAuthors(bookList));
    }

    public static Set<Author> getAuthors (List<Book> bookList){
        Set<Author> authorsSet = new HashSet<>();

        for (Book b: bookList) {
            authorsSet.add(b.getAuthor());
        }

        return authorsSet;
    }
}