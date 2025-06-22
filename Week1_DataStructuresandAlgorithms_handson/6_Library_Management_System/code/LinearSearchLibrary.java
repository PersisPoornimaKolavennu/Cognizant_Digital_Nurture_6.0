class Book {
    int bookId;
    String title;
    String author;

    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "BookID: " + bookId + ", Title: " + title + ", Author: " + author;
    }
}

public class LinearSearchLibrary {
    public static Book linearSearch(Book[] books, String title) {
        for (Book book : books) {
            if (book.title.equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Book[] books = {
            new Book(1, "To Kill a Mockingbird", "Harper Lee"),
            new Book(2, "1984", "George Orwell"),
            new Book(3, "The Great Gatsby", "F. Scott Fitzgerald")
        };

        String searchTitle = "1984";
        Book result = linearSearch(books, searchTitle);

        System.out.println(result != null ? result : "Book not found.");
    }
}
