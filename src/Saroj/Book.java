package Saroj;

import java.util.ArrayList;

public class Book {
    int Id;
    String bookTitle;
    String author;


    public Book(String bookTitle,int Id, String author){
        this.bookTitle = bookTitle;
        this.Id = Id;
        this.author=author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookTitle='" + bookTitle + '\'' +
                ", Id=" + Id +
                ", author='" + author + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Book book1 = new Book("The Grass is Always Greener",10,"Jeffrey Archer");
        Book book2 = new Book("A Boy at Seven",5,"John Bidwell");
        Book book3 = new Book("The Open Boat",10,"Stephen Crane");
        ArrayList<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
            }
}
