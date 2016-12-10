package pl.danielblacha.dao;

import pl.danielblacha.model.Book;

/**
 * Created by Daniel_B on 06.12.2016.
 */
public interface BookDao {

    void save(Book book);
    public Book get(int id);

}
