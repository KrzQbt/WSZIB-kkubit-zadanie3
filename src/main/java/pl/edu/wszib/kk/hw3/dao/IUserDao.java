package pl.edu.wszib.kk.hw3.dao;

import pl.edu.wszib.kk.hw3.model.User;


public interface IUserDao {
    User getUserByLogin(String login);
    boolean persistUser(User user);
}
