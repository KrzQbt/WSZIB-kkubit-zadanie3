package pl.edu.wszib.kk.hw3.services.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.edu.wszib.kk.hw3.dao.IUserDao;
import pl.edu.wszib.kk.hw3.model.User;
import pl.edu.wszib.kk.hw3.model.view.RegistrationModel;
import pl.edu.wszib.kk.hw3.services.IUserService;

import pl.edu.wszib.kk.hw3.session.SessionObject;

import javax.annotation.Resource;


@Service
public class UserServiceImpl implements IUserService {

    @Resource
    SessionObject sessionObject;

    @Autowired
    IUserDao userDao;

    @Override
    public void authenticate(User user) {
        User userFromDatabase = this.userDao.getUserByLogin(user.getLogin());
        if(userFromDatabase == null) {
            return;
        }

        if(user.getPass().equals(userFromDatabase.getPass())) {
            this.sessionObject.setLoggedUser(userFromDatabase);
        }
    }

    @Override
    public void logout() {
        this.sessionObject.setLoggedUser(null);
    }

    @Override
    public boolean register(RegistrationModel registrationModel) {
        if(this.userDao.getUserByLogin(registrationModel.getLogin()) != null) {
            return false;
        }

        User newUser = new User(0, registrationModel.getLogin(), registrationModel.getPass(), User.Role.USER);

        return this.userDao.persistUser(newUser);
    }
}
