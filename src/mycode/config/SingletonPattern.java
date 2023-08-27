package mycode.config;

import mycode.programari.service.ProgramareService;
import mycode.programari.service.ProgramareServiceImpl;
import mycode.programariUsers.service.ProgramariUserService;
import mycode.programariUsers.service.ProgramariUserServiceImpl;
import mycode.user.service.UserService;
import mycode.user.service.UserServiceImpl;

public class SingletonPattern {
    private static ProgramareService programareService;

    private static ProgramariUserService programariUserService;
    private static UserService userService;

    public static   ProgramareService getProgramareService(){
        if(programareService ==null){
            programareService =new ProgramareServiceImpl();
        }
        return programareService;
    }

    public static ProgramariUserService getProgramariUserService(){
        if(programariUserService==null){
            programariUserService=new ProgramariUserServiceImpl();
        }
        return programariUserService;
    }

    public static UserService getUserService(){
        if (userService == null) {
            userService=new UserServiceImpl();
        }
        return userService;
    }


}
