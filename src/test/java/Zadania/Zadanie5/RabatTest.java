package Zadania.Zadanie5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RabatTest {

    @ParameterizedTest
    @CsvSource({
        "50.0,  true,   Rabat wynosi 5%",
        "100.0, true,   Rabat wynosi 5%",
        "100.0, false,  Karta",
        "201.2, true,   Rabat wynosi 15%",
        "400.0, true,   Rabat wynosi 20%",
        "400.1, true,   Rabat wynosi 25%",
    })

    public void testRabat (double price, boolean czyJestKlientem, String komunikat) {
        
        //Arrange
        Rabat wyliczenie = new Rabat();

        //Act
        String wynik = wyliczenie.calculateRabat(price,czyJestKlientem);

        //Assert
        assertEquals(wynik,komunikat);
    }   
 }