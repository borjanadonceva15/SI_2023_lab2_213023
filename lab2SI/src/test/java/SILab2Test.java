import jdk.jfr.Percentage;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class SILab2Test {


    @Test
    void everybranch(){
        List<User> users = new ArrayList<>();

        //test1
        String username1="borjanadonceva";
        String password1 = null;
        String email1 = "anything";
        User user1 = new User(username1, null, email1);
        users.add(user1);
        RuntimeException ex;
        ex=assertThrows(RuntimeException.class, ()-> SILab2.function(user1, users));
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));

        //test2
        String username2=null;
        String password2 = "SI2023";
        String email2 = "borjanadonceva15@gmail.com";
        User user2 = new User(username2, password2, email2);
        users.add(user2);
        assertEquals(false, SILab2.function(user2,users));

        //test3
        String username3="borjanadonceva";
        String password3 = "SI2023lab2";
        String email3 = "borjanadonceva15@gmail.com";
        User user3 = new User(username3, password3, email3);
        users.add(user3);
        assertEquals(false, SILab2.function(user3,users));

        //test4
        String username4="borjanadonceva";
        String password4 = "SI2023@lab2";
        String email4 = "borjanadonceva15@gmail.com";
        User user4 = new User(username4, password4, email4);
        assertEquals(false, SILab2.function(user4,users));

        //test5
        String username5="borjana";
        String password5 = "SI2023@ lab2";
        String email5 = "borjanadonceva15@gmail.com";
        User user5 = new User(username5, password5, email5);
        assertEquals(false, SILab2.function(user5,users));
    }
    @Test
    void multiplecondition(){
        List<User> users=new ArrayList<>();

        //test1
        User u1=null;
        RuntimeException ex;
        ex=assertThrows(RuntimeException.class, () -> SILab2.function(u1,users));
        assertTrue(ex.getMessage().contains("Mendatory information missing!"));

        //test2
        String username2="Travijan";
        String password2 = null;
        String email2 = "travijandoncev@gmail.com";
        User u2 = new User(username2, password2, email2);
        ex=assertThrows(RuntimeException.class, () -> SILab2.function(u2,users));
        assertTrue(ex.getMessage().contains("Mendatory information missing!"));

        //test3
        String username3="Aleksandra";
        String password3 = "aleks0410";
        String email3 = null;
        User u3 = new User(username3, password3, email3);
        ex=assertThrows(RuntimeException.class, () -> SILab2.function(u3,users));
        assertTrue(ex.getMessage().contains("Mendatory information missing!"));

        //test4
        String username4="Angela";
        String password4 = "engel 21";
        String email4= "angelamilenkova@gmail.com";
        User u4 = new User(username4, password4, email4);
        assertTrue(SILab2.function(u4,users));
    }

}
