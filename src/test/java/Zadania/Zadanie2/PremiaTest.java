package Zadania.Zadanie2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PremiaTest {
    
    private Premia hhh;

    @BeforeEach
    public  void setUp() {
        hhh = new Premia();
    }

    @Test
    public void testesPremia0() {
        assertEquals(0, hhh.countBonus(3));
    }
    @Test
    public void testesPremia50() {
        assertEquals(50, hhh.countBonus(4));
    }
    @Test
    public void testesPremia75() {
        assertEquals(75, hhh.countBonus(9));
    }
    @Test
    public void testesPremia100() {
        assertEquals(100, hhh.countBonus(12));
    }
    @Test
    public void testesPremia777() {
        assertEquals(777, hhh.countBonus(99));
    }
}
