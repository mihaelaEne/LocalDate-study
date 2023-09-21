package mycode.view;

import mycode.programari.model.Programare;
import mycode.programari.service.ProgramareService;
import mycode.programari.service.ProgramareServiceSingleton;
import mycode.programariUsers.service.ProgramariUserService;
import mycode.programariUsers.service.ProgramariUserServiceSingleton;
import mycode.user.model.Client;
import mycode.user.model.Doctor;
import mycode.user.model.User;
import mycode.user.service.UserService;
import mycode.user.service.UserServiceSingleton;

import java.time.LocalDateTime;
import java.util.*;

public class ViewClientImpl implements ViewClient{

    private Scanner scanner;
    private UserService userService;
    private ProgramareService programareService;

    private ProgramariUserService programariUserService;
    private Map<User, Set<Programare>> program;


    private User user = new Client(1, "alex andrei","neuro");



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
        System.out.println("Afisare programari-> tasta 1");
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


    private void afisareProgramriUser(){
        program.get(this.user).stream().forEach(programare -> {


            //todo:gasesc doctorul programrii

              List<Integer> idsUsers=this.programariUserService.getProgrmareUsersIds(programare.getId());
              Doctor doctor;
              if(idsUsers.get(0)!=this.user.getId()){
                  doctor=this.userService.findDoctorById(idsUsers.get(0));
              }else{
                  doctor=this.userService.findDoctorById(idsUsers.get(1));
              }

              if(doctor!=null){
                  System.out.println(programare);
                  System.out.println("Doctorul este: "+doctor.getDescrire()                                                    );

              }



              //todo:manage er


        });
    }


    private void adaugareProgramare(){



        System.out.println("Introduceti data de inceput a programarii ( dd,mm,yyyy,hh,mm)");
        LocalDateTime dataInceput=LocalDateTime.parse(scanner.nextLine());
        System.out.println("Introduceti data de sfarsit a programarii ( dd,mm,yyyy,hh,mm)");
        LocalDateTime dataSfarsit=LocalDateTime.parse(scanner.nextLine());

//      Programare programare=programareService.findById(id);
//      if (programare==null){
//          Programare programareNoua=new Programare(dataInceput, dataSfarsit,id);
//          programareService.add(programareNoua);
//      }else{
//          System.out.println("Exista deja o programare cu datele introduse");
//      }

    }



}
