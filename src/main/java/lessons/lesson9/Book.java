package lessons.lesson9;

public class Book {
    int id;
    String bookName;

    public Book(int id, String bookName) {
        this.id = id;
        this.bookName = bookName;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                '}';
    }
}
