package Zadania.Zadanie6;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ExamTest {
    @ParameterizedTest
    @ValueSource(strings={
        "B;B;B;B;B;B;B;B;B;B", //bardzo dobry
        "B;B;B;B;B;B;B;B;B;_", //dobry plus
        "B;B;B;B;B;B;B;B;B;A", //dobry
        "B;B;B;B;B;B;B;B;C;_", //dostateczny plus
        "B;B;B;B;B;B;B;B;A;D", //dostateczny
        "B;B;B;B;B;B;B;A;_;_" //niedostateczny
    })
    public void examTestidyTest(String answers){
        //Arrange
        Exam exam = new Exam();
        //Act 
        String result = exam.calculateExam(answers);
        //Assert
        assertEquals(testResults(answers), result);
    }

    private String testResults(String answers) {
        switch (answers) {
            case "B;B;B;B;B;B;B;B;B;B":
                return "bardzo dobry";               
            case "B;B;B;B;B;B;B;B;B;_":
                return "dobry plus";               
            case "B;B;B;B;B;B;B;B;B;A":
                return "dobry";               
            case "B;B;B;B;B;B;B;B;C;_":
                return "dostateczny plus";               
            case "B;B;B;B;B;B;B;B;A;D":
                return "dostateczny";               
            case "B;B;B;B;B;B;B;A;_;_":
                return "niedostateczny";               
            default:
                return "Nie chciales testowac takiej kombinacji!";
        }
    }
}

