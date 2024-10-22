package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers ();
    void saveUser(User user);
    void removeUser(long id);
    void updateUser(User user);
    User getUser(long id);
}
