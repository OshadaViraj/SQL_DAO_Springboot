package pl.danielblacha.dao;

import org.springframework.stereotype.Repository;
import pl.danielblacha.model.User;
import pl.danielblacha.model.UserDetails;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

/**
 * Created by Daniel_B on 07.12.2016.
 */
@Repository
public class UserDaoImp implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public void save(User user) {
        UserDetails details=user.getUserDetails();
        if (details != null && details.getId()==null){
            entityManager.persist(details);
        }
        entityManager.persist(user);
    }

    @Override
    @Transactional
    public User get(int id) {
        return entityManager.find(User.class,id);
    }
}
