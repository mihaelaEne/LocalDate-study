package mycode.view;

import mycode.programari.service.ProgramareService;
import mycode.programari.service.ProgramareServiceSingleton;
import mycode.user.service.UserService;
import mycode.user.service.UserServiceSingleton;

import java.util.Scanner;

public class ViewClient {

    private Scanner scanner;
    private UserService userService;

    private ProgramareService programareService;



    public void UserServiceImpl() {
        this.userService = UserServiceSingleton.get();
        this.programareService= ProgramareServiceSingleton.get();

        scanner = new Scanner(System.in);
        play();

    }

    public void meniu() {
        System.out.println("Buna ziua!");
        System.out.println("Apasa tasta 1 pentru a afisa toti clientii");
        System.out.println("Apasa tasta 2 pentru a adauga un client");
        System.out.println("Apasa tasta 3 pentru a sterge un client");
    }


    public void play() {
        int alegere = 0;
        boolean running = true;

        while (running) {
            meniu();
            alegere = Integer.parseInt(scanner.nextLine());
            switch (alegere) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;


                default:
                    System.out.println("Alegere incorecta");
                    break;
            }
        }
    }

    private void addClient() {
//        System.out.println("type: ");
//        String type = scanner.nextLine();
//        System.out.println("id: ");
//        int id = Integer.parseInt(scanner.nextLine());
//        System.out.println("descriere: ");
//        String descriere = scanner.nextLine();
//        System.out.println("afectiune: ");
//        String afectiune = scanner.nextLine();
//
//        User client  =(Client)userServiceImpl.findUserById(id);
//        if(client==null){
//            Client client1=new Client(type,id,descriere,afectiune);
//            userServiceImpl.add(client1);
//        }else{
//            System.out.println("erpare");
//        }
    }

    private void removeClient() {

    }


}
