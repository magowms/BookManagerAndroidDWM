package pt.ipca.androidbookdwm.utils;

import android.app.Application;

import java.util.ArrayList;
import java.util.List;

import pt.ipca.androidbookdwm.models.Book;

public class BookManagerApp extends Application {

    private List<Book> lstBook = new ArrayList<>();

    @Override
    public void onCreate(){
        super.onCreate();
        Book book1 = new Book("Livro 1","Eu","1",)
    }


    public void addBook(Book book)
    {
        lstBook.add(book);
    }

    public void removeBook(int position)
    {
        lstBook.remove(position);
    }


}
