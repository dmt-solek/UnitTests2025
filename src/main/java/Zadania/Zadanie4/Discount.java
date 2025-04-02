package Zadania.Zadanie4;
public class Discount{
    public static void main (String args[])
        {
        }
        public static double calculateDiscount(double price){
            if(price<=0){
             price = 0;
            }else if(price>0 && price<=5000){
            }else if(price>5000&&price<=15000){
             price=Math.floor(price*0.7 );
            }else if(price>15000&&price<=50000){
             price=Math.floor(price*0.6);
            }else if(price>50000){
             price=Math.floor(price*0.2);
            };
            return price;
         }

    }