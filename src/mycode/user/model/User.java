package mycode.user.model;

public class User implements  UserBuilder{

    private String type;
    private int id;
    private String descrire;

    public User( String type,int id, String descrire) {
        this.id = id;
        this.descrire = descrire;
    }

    public User() {
    }


    public User(String prop){
        String [] split=prop.split(",");
        this.type=split[0];
        this.id=Integer.parseInt(split[1]);
        this.descrire=split[2];
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescrire() {
        return descrire;
    }

    public void setDescrire(String descrire) {
        this.descrire = descrire;
    }

    @Override
    public String toString() {
        return "User{" +
                "type='" + type + '\'' +
                ", id=" + id +
                ", descrire='" + descrire + '\'' +
                '}';
    }

    @Override
    public User id(int id) {
        this.id=id;
        return this;
    }

    @Override
    public User descriere(String descriere) {
        this.descrire=descriere;
        return this;
    }

    @Override
    public User type(String type) {
        this.type=type;
        return this;
    }
    public static User build(){
        return new User();
    }
}
