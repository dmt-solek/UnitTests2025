package Zadania.Zadanie2;
public class Premia{
	public static void main (String args[]) {
		}
	
		public String wysokoscPremii (int staz) {
		if (staz < 0 || staz > 70) {
			return "Podaj poprawne dane";
		}
		else if (staz < 4) {
			return "0%";
		}	
		else if (staz >= 4 && staz <= 8) {
			return "50%";
		}
		else if (staz > 8 && staz <= 11) {
			return "75%";
		}
		else {
			return "100%";
		}
	}
}