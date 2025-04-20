package Zadania.Zadanie1;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class ClubTest {
    @Test
    public void testAge1 () {
        //Arrange
        Club klub = new Club();
        //Act
        boolean age = klub.getAge(17);
        //Assert
        assertFalse(age);
    }

    @Test
    public void testAge2 () {
        //Arrange
        Club klub = new Club();
        //Act
        boolean age = klub.getAge(18);
        //Assert
        assertTrue(age);
    }
}
