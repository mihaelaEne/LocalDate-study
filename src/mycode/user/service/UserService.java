package mycode.user.service;

import mycode.user.model.User;

public interface UserService {
     void load();
     void afisareUser();

     void add(User user);
     void remove(User user);

}
