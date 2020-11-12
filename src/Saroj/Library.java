package Saroj;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Date;

public class Library {
    ArrayList<Book> bookList;
    String name;

    public void rentBook(LibraryUsers username, Book book){
        username.attachBook(book);
        Date startdate = Rent.getStartdate();
        Date endDate = Rent.getEndingdate();


    }
    }
