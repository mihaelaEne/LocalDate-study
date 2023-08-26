package mycode.user.service;

import mycode.user.model.IUserFactory;
import mycode.user.model.User;
import mycode.user.model.UserFactory;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class UserServiceImpl implements UserService {

    private ArrayList<User> users;
    private IUserFactory userFactory;

    public UserServiceImpl(){
        this.users=new ArrayList<>();
        this.userFactory= new UserFactory();
        this.load();
    }

    public UserServiceImpl(ArrayList<User> users){
        this.users=users;
    }

    public void load(){

        try {
            File file = new File("C:\\mycode\\OOP\\Programari\\src\\mycode\\user\\repository\\client.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                this.users.add(this.userFactory.generateUser(scanner.nextLine()));
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public void afisareUser(){
        for(int i =0; i< users.size(); i++){
            System.out.println(this.users.get(i).toString());
            System.out.println("\n");
        }
    }

}
