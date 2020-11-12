package Saroj;

import java.util.ArrayList;

public class LibraryUsers {
   String username;
   ArrayList<Book> booksRented;

   public void attachBook(Book book){
       booksRented.add(book);
   }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public String toString() {
        return "LibraryUsers{" +
                "username='" + username + '\'' +
                ", booksRented=" + booksRented +
                '}';
    }
}
