package Zadania.Zadanie2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PremiaTest {
    private Premia pracownik;
    
    @BeforeEach
    public void setUp() {
        pracownik = new Premia();
    }

    @Test
    public void wysokoscPremii0() {
        assertEquals("0%",pracownik.wysokoscPremii(3));
    }

    @Test
    public void wysokoscPremii50() {
        assertEquals("50%",pracownik.wysokoscPremii(4));
    }

    @Test
    public void wysokoscPremii75() {
        assertEquals("75%",pracownik.wysokoscPremii(9));
    }

    @Test
    public void wysokoscPremii100() {
        assertEquals("100%",pracownik.wysokoscPremii(12));
    }

    @Test
    public void wysokoscPremii000() {
        assertEquals("Podaj poprawne dane",pracownik.wysokoscPremii(71));
    }
}
