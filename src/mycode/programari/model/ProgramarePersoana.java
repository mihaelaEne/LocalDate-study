package mycode.programari.model;

import java.util.Objects;

public class ProgramarePersoana implements ProgramarePersoanaBuilder, Comparable<ProgramarePersoana> {
    private int id;

    private int idUser;
    private int idProgramare;

    public ProgramarePersoana() {
    }

    public ProgramarePersoana(int id, int idUser, int idProgramare) {
        this.id = id;
        this.idUser = idUser;
        this.idProgramare = idProgramare;
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
    public String toString() {

        String text="";
        text+="Programare persoana:"+"\n";
        text+="Id: "+this.id+"\n";
        text+="Id user: "+this.idUser+"\n";
        text+="Id Programare: "+this.idProgramare;
        return text;
    }

    @Override
    public ProgramarePersoana id(int id) {
      this.id=id;
      return this;
    }

    @Override
    public ProgramarePersoana idUser(int idUser) {
        this.idUser=idUser;
        return this;
    }

    @Override
    public ProgramarePersoana idProgramare(int idProgramare) {
        this.idProgramare=idProgramare;
        return this;
    }

    public static ProgramarePersoana build() {
        return new ProgramarePersoana();
    }

    @Override
    public boolean equals(Object o) {
        ProgramarePersoana pp=(ProgramarePersoana) o;
        return  this.id== pp.id&&this.idUser==pp.idUser&& this.idProgramare==pp.idProgramare;
    }



    @Override
    public int compareTo(ProgramarePersoana o) {
        if(this.id>o.id){
            return 1;
        }else if(this.id<o.id){
            return -1;
        }else{
            return 0;
        }


    }
}
