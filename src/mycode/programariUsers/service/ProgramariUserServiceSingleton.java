package mycode.programariUsers.service;

public class ProgramariUserServiceSingleton {

    private static ProgramariUserService programariUserService;

    public static ProgramariUserService get(){
        if(programariUserService==null){
            programariUserService=new ProgramariUserServiceImpl();
        }
        return programariUserService;
    }


}
