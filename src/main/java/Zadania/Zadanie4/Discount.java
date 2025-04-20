package Zadania.Zadanie4;

public class Discount{
    public static void main (String args[])
        {
        }
        public static double calculateDiscount(double price){
            if (price <= 5000.0) {
                return price;
            }
            else if (price > 5000.0 && price <= 15000.0) {
                price = price * 0.7;
            }
            else if (price > 15000.0 && price <= 50000.0) {
                price = price * 0.6;
            }
            else {
                price = price * 0.2;
            }
            return price;
         }
    }