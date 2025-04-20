package Zadania.Zadanie7;

public class CardGame{
  public static void main (String args[]){
      }

    public static String winner(String[] deckAdam, String[] deckMati) {
        String cards = "23456789TJQKA";
        int sAdam = 0;
        int sMati = 0;
        for (int i = 0; i < deckAdam.length; i++) {
          int winner = cards.indexOf(deckAdam[i]) - cards.indexOf(deckMati[i]);
          sAdam += winner > 0 ? 1 : 0;
          sMati += winner < 0 ? 1 : 0;
        }    
        return(sAdam > sMati) ? "Adam wygrywa " + sAdam + " do " + sMati :
              (sMati > sAdam) ? "Mati wygrywa " + sMati + " do " + sAdam :
              "Remis";
    }
}