package mycode.programari.service;

import mycode.programari.model.Programare;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class ProgramareServiceImpl implements ProgramareService {

    private ArrayList<Programare> programari;

    public ProgramareServiceImpl(){
        this.programari=new ArrayList<>();
        this.load();
    }



    public ProgramareServiceImpl(ArrayList<Programare> programari){
        this.programari=programari;
    }

    public  void load(){
        try{
            File file=new File("C:\\mycode\\OOP\\Programari\\src\\mycode\\programari\\repository\\programare.txt");
            Scanner scanner=new Scanner(file);
            while (scanner.hasNextLine()){
                Programare programare=new Programare(scanner.nextLine());
                this.programari.add(programare);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void afisareProgramare(){
        for(int i=0; i<programari.size(); i++){
            System.out.println(this.programari.get(i).toString());
            System.out.println("\n");
        }
    }
}
