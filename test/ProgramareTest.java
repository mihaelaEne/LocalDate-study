import mycode.programari.model.Programare;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class ProgramareTest {

    //"dd,mm,yyyy,hh,mm"

    @Test
    public void testProgramare(){


        Programare programare0= new Programare("1,1,2023,0,0","1,2,2023,2,2");
        Programare programare1=new Programare("3,12,2022,12,45","3,12,2022,12,50");
        Programare programare2=new Programare("3,12,2022,12,45","3,12,2022,12,50");
        Programare programare3= new Programare("3,12,2022,10,30","3,12,2022,12,47");
        Programare programare4=new Programare("12,05,2019,7,11","12,05,2019,9,0");
        Programare programare5=new Programare("12,05,2019,8,5","12,05,2019,10,26");
        Programare programare6=new Programare("7,8,2018,16,8","7,8,2018,18,0");
        Programare programare7=new Programare("7,8,2018,12,7","7,8,2018,21,22");
        Programare programare8=new Programare("7,10,2023,7,7","6,8,2024,9,9");
        Programare programare9=new Programare("7,10,2023,7,7", "6,8,2024,8,9");
        Programare programare10=new Programare("10,10,2002,10,30","10,10,2002,13,55");
        Programare programare11=new Programare("10,10,2002,12,17","10,10,2002,13,55");


//        System.out.println(programare1);
//        System.out.println("\n");
//        System.out.println(programare2);
//        System.out.println("\n");
//        System.out.println(programare3);
//        System.out.println("\n");
//        System.out.println(programare4);
//        System.out.println("\n");
//        System.out.println(programare5);
//        System.out.println("\n");
//        System.out.println(programare6);

//       if(programare5.equals(programare6)) {
//           System.out.println("Se suprapun");
//       }else {
//           System.out.println("Progr nu se suprapun");
//       }

//        verificam suprapunerea

      assertEquals(programare1,programare2);
      assertEquals(programare2, programare3);
      assertEquals(programare4,programare5);
      assertEquals(programare6,programare7);
      assertEquals(programare8,programare9);
      assertEquals(programare10,programare11);


      //verificam nu se suprapun




    }
}
