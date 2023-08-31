package mycode.programari.model;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Programare implements ProgramareBuilder,Comparable<Programare> {
    private int id;
    private LocalDateTime dataInceput;
    private LocalDateTime  dataSfarsit;



    public Programare(){
    }

    public Programare(LocalDateTime dataInceput, LocalDateTime dataSfarsit,int id) {
        this.dataInceput = dataInceput;
        this.dataSfarsit = dataSfarsit;
        this.id=id;
    }

    public Programare(String prop){
        String [] split=prop.split("-");
        setDataDeInceputDataDeSfarsit(split[0],split[1]);
        this.id=Integer.parseInt(split[2]);

    }
    //"dd,mm,yyyy,hh,mm"


     public Programare(String dataDeInceput, String dataDeSfarsit){

        setDataDeInceputDataDeSfarsit(dataDeInceput,dataDeSfarsit);
     }


    public void setDataDeInceputDataDeSfarsit(String dataDeInceput, String dataDeSfarsit) {

        int ddi = Integer.parseInt(dataDeInceput.split(",")[0]);
        int mmi = Integer.parseInt(dataDeInceput.split(",")[1]);
        int yyi = Integer.parseInt(dataDeInceput.split(",")[2]);
        int hhi = Integer.parseInt(dataDeInceput.split(",")[3]);
        int mini = Integer.parseInt(dataDeInceput.split(",")[4]);
        int dds = Integer.parseInt(dataDeSfarsit.split(",")[0]);
        int mms = Integer.parseInt(dataDeSfarsit.split(",")[1]);
        int yys = Integer.parseInt(dataDeSfarsit.split(",")[2]);
        int hhs = Integer.parseInt(dataDeSfarsit.split(",")[3]);
        int mins = Integer.parseInt(dataDeSfarsit.split(",")[4]);

        this.dataInceput = LocalDateTime.of(yyi, mmi, ddi, hhi, mini);
        this.dataSfarsit = LocalDateTime.of(yys, mms, dds, hhs, mins);

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Duration getDurata(){
        return  Duration.between(dataInceput, dataSfarsit);
    }
    public LocalDateTime getDataInceput(){
        return dataInceput;
    }

    public LocalDateTime getDataSfarsit(){
        return dataSfarsit;
    }

    public void setDataInceput(LocalDateTime di){
        dataInceput=di;
    }

    public void setDataSfarsit(LocalDateTime ds){
        dataSfarsit=ds;
    }

    @Override
    public String toString(){


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MMM dd, yyyy HH:mm:ss a");

        String text="";
        text+="Programrea este "+dataInceput.format(formatter)+"\n";
        text+="Se sfarseste la "+dataSfarsit.format(formatter)+"\n";
        text+="Dureaza "+this.getDurata().toMinutes()+" minutes";

        return  text;

    }

    //suprapunere =>true se suprapun  false
    @Override
    public boolean equals(Object o) {
        Programare programare=(Programare) o;
        boolean  condition1=dataSfarsit.compareTo(programare.dataInceput)<0;
        boolean condition2=dataInceput.compareTo(programare.dataSfarsit)>0;
        return !(condition1 || condition2);

    }



    @Override
    public int compareTo(Programare o) {
        if(this.dataInceput.compareTo(o.dataInceput)<0 ){
            return -1;
        }else if(this.dataInceput.compareTo(o.dataInceput)>0){
            return 1;
        }else {
            return 0;
        }
    }



    @Override
    public Programare id(int id) {
        this.id=id;
        return this;
    }

    @Override
    public Programare dataInceput(LocalDateTime dataInceput) {
        this.dataInceput=dataInceput;
        return this;
    }

    @Override
    public Programare dataSfarsit(LocalDateTime dataSfarsit) {
     this.dataSfarsit=dataSfarsit;
     return this;
    }

    public static Programare build(){
        return new Programare();
    }
}
