package mycode.programariUsers.service;

import mycode.programariUsers.model.ProgramareUser;

import java.util.List;

public interface ProgramariUserService {
    void load();
    void afisareProgramareUser();

    ProgramareUser finfById(int id);

    List<ProgramareUser> getAllProgramare(int userId);
}
