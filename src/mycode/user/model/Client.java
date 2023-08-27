package mycode.user.model;

public class Client extends User{

    private String afectiune;


    public Client (){}
    public Client(String type,int id, String descrire, String afectiune) {
        super(type,id, descrire);
        this.afectiune = afectiune;
    }

    public Client(String prop){
        super(prop);
        String [] split =prop.split(",");
        this.afectiune=split[3];
    }
    public String getAfectiune() {
        return afectiune;
    }

    public void setAfectiune(String afectiune) {
        this.afectiune = afectiune;
    }

    @Override
    public String toString() {
        String text="";
        text+="Client: "+"\n";
        text+="id: "+super.getId()+"\n";
        text+="descriere: " +super.getDescrire()+"\n";
        text+="afectiune: "+ this.afectiune;
        return text;
    }
}


