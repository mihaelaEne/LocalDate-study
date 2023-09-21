package mycode;


import mycode.view.ViewClient;
import mycode.view.ViewClientImpl;

public class                   Main {
    public static void main(String[] args) {

        ViewClient viewClient=new ViewClientImpl();
        viewClient.play();

        //plec mereu din interfata
//        ProgramareService programareController = new ProgramareServiceImpl();
//        programareController.afisareProgramare();

//        UserService userController=new UserServiceImpl();
//        userController.afisareUser();


//        ProgramariUserService programareService=new ProgramariUserServiceImpl();
//        programareService.afisareProgramareUser();

    }
}