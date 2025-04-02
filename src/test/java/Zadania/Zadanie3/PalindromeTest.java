package Zadania.Zadanie3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static Zadania.Zadanie3.Palindrome.isPalindrome;

public class PalindromeTest {
  @ParameterizedTest
  @ValueSource(strings = {"mssadam","rssadar","daaaahd","daddaaahd","daassssaahd","daaaahsssssssssd"})
  public void testParameterfalse(String word){
    assertEquals(true, isPalindrome(word));
  }
}
