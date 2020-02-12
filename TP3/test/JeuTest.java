import com.lyon1.lif13.jeu.Coup;
import com.lyon1.lif13.jeu.JoueurAleatoire;
import com.lyon1.lif13.jeu.Plateau;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JeuTest {
    private Plateau p;
    private JoueurAleatoire j;
    @BeforeEach
    void setUp() {
        try {
            p = new Plateau(3,3);
            j = new JoueurAleatoire(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    void plateauInitialisationTest() throws Exception {
        Assertions.assertThrows(Exception.class,()->{
           Plateau p = new Plateau(-1,-1);
        });
        Assertions.assertThrows(Exception.class,()->{
            Plateau p = new Plateau(0,0);
        });
    }

    @Test
    void badCoupInitialisationTest(){
        Assertions.assertThrows(Exception.class,()->{
            Coup p = new Coup(-1,-1);
        });
        try {
            Coup p = new Coup(0,0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    void getCoup() {
    }

    @AfterEach
    void tearDown() {
    }
}