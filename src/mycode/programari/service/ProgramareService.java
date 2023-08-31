package mycode.programari.service;

import mycode.programari.model.Programare;

public interface ProgramareService {


      void load();
      void afisareProgramare();

      void add(Programare programare);
      void remove(int id);

      Programare findById(int id);


}
