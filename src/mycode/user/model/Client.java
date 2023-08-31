package mycode.user.model;

import java.util.Objects;

public class Client extends User  {

    private String afectiune;


    public Client() {
    }

    public Client(String type, int id, String descrire, String afectiune) {
        super(type, id, descrire);
        this.afectiune = afectiune;
    }

    public Client(String prop) {
        super(prop);
        String[] split = prop.split(",");
        this.afectiune = split[3];
    }

    public String getAfectiune() {
        return afectiune;
    }

    public void setAfectiune(String afectiune) {
        this.afectiune = afectiune;
    }

    @Override
    public String toString() {
        String text = "";
        text += "Client: " + "\n";
        text += "id: " + super.getId() + "\n";
        text += "descriere: " + super.getDescrire() + "\n";
        text += "afectiune: " + this.afectiune;
        return text;
    }


//    @Override
//    public int compareTo(Client o) {
//
//        if (this.afectiune.compareTo(o.afectiune) > 0) {
//            return 1;
//        } else if (this.afectiune.compareTo(o.afectiune) < 0) {
//            return -1;
//        } else {
//            return 0;
//        }
//    }

    @Override
    public boolean equals(Object o) {
        Client client=(Client) o;
        return this.afectiune.equals(client.afectiune);
    }

}


