package Zadania.Zadanie3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.platform.commons.util.StringUtils;

public class PalindromeTest {
  @ParameterizedTest

//test z uzyciem MethodSource (wymaga przebudowy metody o dodanie argumentu z lista)  
  // @MethodSource("MethodSourceArgs")
  // void testPalindrome(String slowo, String[] listaSlow) {
  //   assertTrue(Palindrome.isPalindrome(slowo, listaSlow));
  // }

  // static Stream<Arguments> methodSourceArgs() {
  //   return Stream.of(
  //     Arguments.of("kot", new String[]{"lol","madam","ana"})
  //   );
  // }

//test z uzyciem ValueSource
  @ValueSource(strings = {"kot","lol","madam","analiza"})
  void testParameterfalse(String slowo){
    assertEquals(true, Palindrome.isPalindrome(slowo));
  }
}
