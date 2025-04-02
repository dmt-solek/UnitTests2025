package Zadania.Zadanie1;

import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;


public class ClubTest {
    @Test
    public void ClubTest(){
        //arrange
        Club nowyklub = new Club();
        //act
        boolean enter = nowyklub.canYouEnter(17);
        //assert
        assertFalse(enter);


    }
}
