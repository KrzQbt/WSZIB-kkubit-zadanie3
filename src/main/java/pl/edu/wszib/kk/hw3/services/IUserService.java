package pl.edu.wszib.kk.hw3.services;

import pl.edu.wszib.kk.hw3.model.User;
import pl.edu.wszib.kk.hw3.model.view.RegistrationModel;

public interface IUserService {
    void authenticate(User user);
    void logout();
    boolean register(RegistrationModel registrationModel);
}
