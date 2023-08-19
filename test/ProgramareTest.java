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
        

        System.out.println(programare1);


    }
}
