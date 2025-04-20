package Zadania.Zadanie3;
public class Palindrome{
    public static void main (String args[]) {
        }
        public static boolean isPalindrome (String slowo) {
            slowo = slowo.toLowerCase();
            int poczatekSlowa = 0;
            int koniecSlowa = slowo.length() - 1;
            while (poczatekSlowa < koniecSlowa) {
                if (slowo.charAt(poczatekSlowa) != slowo.charAt(koniecSlowa)) {
                    return false;
                }
                poczatekSlowa++;
                koniecSlowa--;
            }
            return true;
        }
    }