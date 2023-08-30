package mycode.user.service;

public class UserServiceSingleton {

    private static UserService userService;

    public static UserService get(){
        if (userService == null) {
            userService=new UserServiceImpl();
        }
        return userService;
    }

}
