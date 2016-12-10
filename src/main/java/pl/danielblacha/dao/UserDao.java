package pl.danielblacha.dao;

import pl.danielblacha.model.User;

/**
 * Created by Daniel_B on 07.12.2016.
 */
public interface UserDao {

    void save(User user);
    public User get(int id);
}
