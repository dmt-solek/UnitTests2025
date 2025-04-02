package Zadania.Zadanie3;
public class Palindrome{
    public static void main (String args[])
    
        {
            
        }
        public static boolean isPalindrome(String word){
            return word.equalsIgnoreCase(new StringBuilder(word).reverse().toString());
        }
    }