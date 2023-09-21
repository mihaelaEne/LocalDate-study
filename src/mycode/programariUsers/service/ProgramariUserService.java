package mycode.programariUsers.service;

import mycode.programariUsers.model.ProgramareUser;
import mycode.user.model.User;

import java.util.List;

public interface ProgramariUserService {
    void load();
    void afisareProgramareUser();

    ProgramareUser finfById(int id);

    List<ProgramareUser> getAllProgramare(int userId);

    List<Integer> getProgrmareUsersIds(int programareId);
}
