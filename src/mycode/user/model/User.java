package mycode.user.model;

import java.util.Objects;

public class User implements  UserBuilder, Comparable<User>{

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

    @Override
    public String toString() {
        String text="";
        text+="User: "+"\n";
        text+=" id: "+this.id+"\n";
        text+="descriere: "+this.descrire+"\n";

        return text;

    }
    @Override
    public boolean equals(Object o) {
      User user=(User) o;
      return this.id==user.id&&this.descrire.equals(user.descrire);
    }


    @Override
    public int compareTo(User o) {
        if(o.id>this.id){
            return -1;
        }else if(o.id<this.id){
            return 1;
        }else {
            return 0;
        }
    }
}
