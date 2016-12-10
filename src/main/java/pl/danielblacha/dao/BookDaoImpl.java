package pl.danielblacha.dao;

import org.springframework.stereotype.Repository;
import pl.danielblacha.model.Book;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

/**
 * Created by Daniel_B on 06.12.2016.
 */

@Repository
public class BookDaoImpl implements BookDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public void save(Book book) {
        entityManager.persist(book);
    }

    @Override
    @Transactional
    public Book get(int id) {
        return entityManager.find(Book.class,id);
    }
}
