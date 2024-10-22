package web.service;

import web.dao.UserDao;
import web.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImp implements UserService {

   private final UserDao userDao;

   @Autowired
   public UserServiceImp(UserDao userDao) {
      this.userDao = userDao;
   }

   @Override
   public List<User> getAllUsers() {
      return userDao.getAllUsers();
   }

   @Transactional
   @Override
   public void saveUser(User user) {
      userDao.saveUser(user);
   }

   @Transactional
   @Override
   public void removeUser(long id) {
      userDao.removeUser(id);
   }

   @Transactional
   @Override
   public void updateUser(User user) {
      userDao.updateUser(user);
   }

   @Override
   public User getUser(long id) {
      return userDao.getUser(id);
   }
}