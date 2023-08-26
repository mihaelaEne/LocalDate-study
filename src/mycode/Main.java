package mycode;

import mycode.programari.service.ProgramareService;
import mycode.programari.service.ProgramareServiceImpl;
import mycode.user.model.UserFactory;
import mycode.user.service.UserService;
import mycode.user.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {

        //plec mereu din interfata
//        ProgramareService programareController = new ProgramareServiceImpl();
//        programareController.load();
//        programareController.afisareProgramare();

        UserService userController=new UserServiceImpl();
        userController.load();
        userController.afisareUser();


    }
}