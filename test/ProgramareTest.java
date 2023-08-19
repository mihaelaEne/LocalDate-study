import com.sun.tools.jconsole.JConsoleContext;
import org.junit.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Set;

public class ProgramareTest {

    //"dd,mm,yyyy,hh,mm"

    @Test
    public void testProgramare(){


        Programare programare= new Programare("1,1,2023,0,0","1,2,2023,2,2");
        Programare programare1=new Programare("3,12,2022,12,45","3,12,2022,12,50");
        Programare programare2=new Programare("12,12,2021,00,12","12,12,2022,00,12");
        Programare programare3=new Programare("6,7,2022,00,40","19,8,2023,00,40");
        Programare programare4=new Programare("15,9,2020,12,30","15,9,2020,12,30");
        Programare programare5=new Programare("7,10,2023,15,7","6,8,2024,9,9");
        Programare programare6=new Programare("7,10,2023,15,7","6,8,2024,9,9");
        System.out.println(programare1);
        System.out.println("\n");
        System.out.println(programare2);
        System.out.println("\n");
        System.out.println(programare3);
        System.out.println("\n");
        System.out.println(programare4);
        System.out.println("\n");
        System.out.println(programare5);
        System.out.println("\n");
        System.out.println(programare6);
    }
}
