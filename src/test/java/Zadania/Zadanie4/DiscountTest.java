package Zadania.Zadanie4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class DiscountTest {
  @ParameterizedTest
  @CsvSource({
    "0,0",
    "3000,3000",
    "5000,5000",
    "7000,4900",
    "15000,10500",
    "16000,9600",
    "50000,30000",
    "53000,10600"
  })

  void calculateDiscountTest(Double wartoscZamowienia, Double cenaPoRabacie) {
    //Arrange
    Discount wyliczenie = new Discount();
    //Act
    double rabat = wyliczenie.calculateDiscount(wartoscZamowienia);
    //Assert
    assertEquals(cenaPoRabacie,rabat,0.1);
  }
}
