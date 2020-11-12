package Saroj;

import java.util.ArrayList;

public class LibraryUsers {
   String username;
   ArrayList<Book> booksRented;

   public void attachBook(Book book){
       booksRented.add(book);
   }




}
