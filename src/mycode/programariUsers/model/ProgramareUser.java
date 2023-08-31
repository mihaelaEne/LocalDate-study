package mycode.programariUsers.model;

import java.util.Objects;

public class ProgramareUser implements Comparable<ProgramareUser>{

    //clasa intermediara, un ffel de enrolment
    private  int id;
    private  int idUser;
    private int idProgramare;


    public ProgramareUser(int id, int idUser, int idProgramare) {
        this.id = id;
        this.idUser = idUser;
        this.idProgramare = idProgramare;
    }

    public ProgramareUser(){}

    public ProgramareUser(String prop){
        String [] split=prop.split(",");
        this.id=Integer.parseInt(split[0]);
        this.idUser=Integer.parseInt(split[1]);
        this.idProgramare=Integer.parseInt(split[2]);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public int getIdProgramare() {
        return idProgramare;
    }

    public void setIdProgramare(int idProgramare) {
        this.idProgramare = idProgramare;
    }


    @Override
    public boolean equals(Object o) {
      ProgramareUser programareUser=(ProgramareUser) o;
        return  this.id== programareUser.id&&this.idUser==programareUser.idUser&& this.idProgramare==programareUser.idProgramare;
    }



    @Override
    public String toString() {

        String text="";
        text+="Programare User: "+"\n";
        text+="id: "+this.id+"\n";
        text+="id user: "+this.idUser+"\n";
        text+="id programare: "+this.idProgramare;
        return text;
    }

    @Override
    public int compareTo(ProgramareUser o) {
        if(o.id>this.id){
            return -1;
        }else if(o.id<this.id){
            return 1;
        }else {
            return 0;
        }

    }
}
