package mycode.user.service;

import mycode.user.model.User;

import java.util.List;

public interface UserService {
     void load();
     void afisareUser();

     void add(User user);
     void remove(User user);

     User findById(int id);

     List<User> getAllUsers();

}
