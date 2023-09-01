package mycode.view;

import mycode.programari.model.Programare;
import mycode.programari.service.ProgramareService;
import mycode.programari.service.ProgramareServiceSingleton;
import mycode.programariUsers.service.ProgramariUserService;
import mycode.programariUsers.service.ProgramariUserServiceSingleton;
import mycode.user.model.Client;
import mycode.user.model.User;
import mycode.user.service.UserService;
import mycode.user.service.UserServiceSingleton;

import java.util.*;

public class ViewClientImpl implements ViewClient{

    private Scanner scanner;
    private UserService userService;
    private ProgramareService programareService;

    private ProgramariUserService programariUserService;
    private Map<User, Set<Programare>> program;


    private User user = new Client("client",1, "alex andrei","neuro");


    public ViewClientImpl() {
        this.userService = UserServiceSingleton.get();
        this.programareService = ProgramareServiceSingleton.get();
        this.programariUserService = ProgramariUserServiceSingleton.get();
        program = new TreeMap<>(    );
        scanner = new Scanner(System.in);
        this.populateProgram();
        play();

    }

    public void meniu() {
        System.out.println("Buna ziua!");
        System.out.println("Afisare programari");
    }

@Override
    public void play() {
        int alegere = 0;
        boolean running = true;

        while (running) {
            meniu();
            alegere = Integer.parseInt(scanner.nextLine());
            switch (alegere) {
                case 1:
                    afisareProgramriUser();
                    break;

                default:
                    System.out.println("Alegere incorecta");
                    break;
            }
        }
    }

    private Set<Programare> getAllUserProgramari(int userId) {
        Set<Programare> programariListaSet = new TreeSet<>();
        this.programariUserService.getAllProgramare(userId).forEach(programareUser -> {
            Programare byId = this.programareService.findById(programareUser.getIdProgramare());
            programariListaSet.add(byId);

        });
        return programariListaSet;
    }


    private void populateProgram() {
        this.userService.getAllUsers().forEach(user -> {
            this.program.put(user, this.getAllUserProgramari(user.getId()));
        });
    }


    public void afisareProgramriUser(){
        program.get(this.user).stream().forEach(System.out::println);
    }


}
