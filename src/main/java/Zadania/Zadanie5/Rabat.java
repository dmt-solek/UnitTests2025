package Zadania.Zadanie5;
public class Rabat{
    public static void main (String args[])
        {
            
    }
    public static String calculateDiscount(double price,boolean isClient){
        String result;
        if(isClient!=true){
            return "Karta klienta";
        }else{
            if(price>400){
                return "Rabat wynosi 25%";
            }else if(price>300){
                return"Rabat wynosi 20%";
            }else if(price>200){
                return"Rabat wynosi 15%";
            }else if(price>100){
                return"Rabat wynosi 10%";
            }else{
                return"Rabat wynosi 5%";
            }
        }
}
}