package mycode.programari.model;

public class ProgramarePersoana implements ProgramarePersoanaBuilder {
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
        return "ProgramarePersoana{" +
                "id=" + id +
                ", idUser=" + idUser +
                ", idProgramare=" + idProgramare +
                '}';
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
}
