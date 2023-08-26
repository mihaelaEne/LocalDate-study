package mycode.user.model;

public class Doctor  extends User{

    private String sectieSpital;

    public Doctor(String type,int id, String descrire, String sectieSpital) {
        super(type,id, descrire);
        this.sectieSpital = sectieSpital;
    }

    public Doctor (String prop){
        String [] split =prop.split(",");
        this.sectieSpital=split[3];
    }

    public String getSectieSpital() {
        return sectieSpital;
    }

    public void setSectieSpital(String sectieSpital) {
        this.sectieSpital = sectieSpital;
    }

    @Override
    public String toString() {
        String text="";
        text+="Doctor"+"\n";
        text+="id: "+super.getId()+"\n";
        text+="descriere: " +super.getDescrire()+"\n";
        text+="sectie Spita: "+ this.sectieSpital;
        return text;
    }
}
