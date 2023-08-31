package mycode.programariUsers.service;

import mycode.programariUsers.model.ProgramareUser;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramariUserServiceImpl implements ProgramariUserService {

    private ArrayList<ProgramareUser> programariUsers;

    public ProgramariUserServiceImpl() {
        this.programariUsers = new ArrayList<>();
        this.load();
    }

    public ProgramariUserServiceImpl(ArrayList<ProgramareUser> programariUsers) {
        this.programariUsers = programariUsers;
    }

    @Override
    public void load() {
        try {
            File file = new File("C:\\mycode\\OOP\\Programari\\src\\mycode\\programariUsers\\repository\\programariUser.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                ProgramareUser programariUser = new ProgramareUser(scanner.nextLine());
                this.programariUsers.add(programariUser);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void afisareProgramareUser() {
        for (int i = 0; i < programariUsers.size(); i++) {
            System.out.println(this.programariUsers.get(i).toString());
            System.out.println("\n");
        }
    }

    @Override
    public ProgramareUser finfById(int id) {
        for(int i=0; i< programariUsers.size(); i++){
            if(programariUsers.get(i).getId()==id){
                return programariUsers.get(i);
            }
        }
        return  null;
    }

    @Override
    public List<ProgramareUser> getAllProgramare(int userId) {

        List<ProgramareUser> programariIds = new ArrayList<>();
        this.programariUsers.forEach(e -> {
            if (e.getIdUser() == userId) {
                programariIds.add(e);
            }
        });

        return programariIds;
    }


}
