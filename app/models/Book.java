package models;

//import io.ebean.Model;
//
//import javax.persistence.Entity;
//import javax.persistence.Id;

import java.util.HashSet;
import java.util.Set;

//@Entity
public class Book {
    //    @Id
    public Integer id;
    public String title;
    public int price;
    public String author;

    public Book() {

    }

    public Book(Integer id, String title, int price, String author) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.author = author;
    }

    private static Set<Book> books;

    static {
        books = new HashSet<>();
        books.add(new Book(1, "C++", 1200, "ABc"));
        books.add(new Book(2, "Flutter", 1200, "Xyz"));
        books.add(new Book(3, "Java", 1200, "Dec"));
    }

    public static Set<Book> allBooks() {
        return books;
    }

    public static Book findById(Integer id) {
        for (Book book : books) {
            if (id.equals(book.id)) return book;
        }
        return null;
    }

    public static void add(Book book) {
        books.add(book);
    }

    public static void remove(Book book) {
        books.remove(book);
    }
}
