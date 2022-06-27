public class Book {
    private final String title;
    private final Author author;

    public Book(String title, Author author) {
        this.title = title;
        this.author = author;
    }

    public Author getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author=" + author +
                '}';
    }
}
