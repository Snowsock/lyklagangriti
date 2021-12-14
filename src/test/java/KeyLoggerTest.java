import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KeyLoggerTest {

    @Test
    void iLnLnLeLbAhouldRetrunbenni() {
        KeyLogger k = new KeyLogger("iLnLnLeLb");
        assertEquals("benni", k.getPsw());
    }

    @Test
    void arnarLLLBBunShouldReturnunnar() {
        KeyLogger k = new KeyLogger("arnarLLLBBun");
        assertEquals("unnar", k.getPsw());
    }
}