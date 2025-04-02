package Zadania.Zadanie0;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Hellotest {
    @Test
    public void meh(){
        //Arrange
        HelloWorld hejka = new HelloWorld();
        //Act
        String greeting = hejka.getGreeting();
        //Assert
        assertEquals("HelloWorld!!one",greeting);
    }
}
