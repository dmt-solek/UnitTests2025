package Zadania.Zadanie5;

public class Rabat{
    public static void main (String args[]){   
    }

    public static String calculateRabat(double price, boolean czyJestKlientem){

        if (czyJestKlientem) {
            if (price <= 100.0) {
                return "Rabat wynosi 5%";
            }
            else if (price > 100.0 && price <= 200.0) {
                return "Rabat wynosi 10%";
            }
            else if (price > 200.0 && price <= 300.0) {
                return "Rabat wynosi 15%";
            }
            else if (price > 300.0 && price <= 400.0) {
                return "Rabat wynosi 20%";
            }
            else {
                return "Rabat wynosi 25%";
            }
        }
        else {
            return "Karta";
        }
    }
}