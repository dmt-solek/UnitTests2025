package Zadania.Zadanie5;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

public class RabatTest {

    @ParameterizedTest
    @CsvSource({
        "6.0,      false, Karta klienta",
        "401.0,    true, Rabat wynosi 25%",      
        "301.0,    true, Rabat wynosi 20%",      
        "400.0,    true, Rabat wynosi 20%",      
        "201.0,    true, Rabat wynosi 15%",      
        "300.0,    true, Rabat wynosi 15%",      
        "101.0,    true, Rabat wynosi 10%",      
        "200.0,    true, Rabat wynosi 10%",      
        "100.0,    true, Rabat wynosi 5%",       
        "1.0,      true, Rabat wynosi 5%",       
        "1.0,      true, Rabat wynosi 5%",      
        "100000.0, true, Rabat wynosi 25%",  
        "10000.0,  false, Karta klienta" 
    })
    public void testParameterFalseHe( double price, boolean isClient,String komunikat) {
        // Arrange
        Rabat rabat = new Rabat();

        // Act
        String actualResult = rabat.calculateDiscount(price, isClient);

        // Assert
        assertEquals(komunikat, actualResult);
    }

    private static Stream<Arguments> provideStringsForIsBlank() {
        return Stream.of(
            Arguments.of("Karta klienta", 6.0, false)
           
        );
    }
         
 }












//  Arguments.of("Rabat wynosi 25%", 401.0,     true),
//  Arguments.of("Rabat wynosi 20%", 301.0,     true),
//  Arguments.of("Rabat wynosi 20%", 400.0,     true),
//  Arguments.of("Rabat wynosi 15%", 201.0,     true),
//  Arguments.of("Rabat wynosi 15%", 300.0,     true),
//  Arguments.of("Rabat wynosi 10%", 101.0,     true),
//  Arguments.of("Rabat wynosi 10%", 200.0,     true),
//  Arguments.of("Rabat wynosi 5%",  100.0,     true),
//  Arguments.of("Rabat wynosi 5%",  1.0,       true),
//  Arguments.of("Rabat wynosi 5%", -1.0,       true),
//  Arguments.of("Rabat wynosi 25%", 1000000.0, true),
//  Arguments.of("Karta klienta", 1000000.0,    false)