package mycode.programari.model;

import java.time.LocalDateTime;

public interface ProgramareBuilder {
    Programare id(int id);
    Programare dataInceput(LocalDateTime dataInceput);
    Programare dataSfarsit(LocalDateTime dataSfarsit);
}
