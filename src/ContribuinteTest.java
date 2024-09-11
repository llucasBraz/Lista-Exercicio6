package listas.lista01;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContribuinteTest {

    @Test
    public void testPodeAposentarMulher() {
        Contribuinte contribuinte = new Contribuinte(63, "F", 15);
        assertTrue(contribuinte.podeAposentar());
    }

    @Test
    public void testNaoPodeAposentarHomem() {
        Contribuinte contribuinte = new Contribuinte(64, "M", 19);
        assertFalse(contribuinte.podeAposentar());
    }
}
