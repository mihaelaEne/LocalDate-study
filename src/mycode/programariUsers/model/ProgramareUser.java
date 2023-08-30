package mycode.programariUsers.model;

public class ProgramareUser {

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
    public String toString() {
        return "ProgramareUser{" +
                "id=" + id +
                ", idUser=" + idUser +
                ", idProgramare=" + idProgramare +
                '}';
    }
}
