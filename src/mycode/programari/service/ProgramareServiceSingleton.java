package mycode.programari.service;

public class ProgramareServiceSingleton {

    private static ProgramareService programareService;

    public static   ProgramareService get(){
        if(programareService ==null){
            programareService =new ProgramareServiceImpl();
        }
        return programareService;
    }
}
