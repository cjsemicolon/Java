import java.util.Scanner;

public class OshoFreePromoEngine {

    public static double discountPrice(int cartTotal, String promoCode ) {
        
        if (cartTotal < 5000 && promoCode .equals("STATER10")){
           
             return cartTotal;

        }else if (cartTotal >= 5000 && cartTotal < 15000 && promoCode .equals("STATER10")) {
            
            double discount = 0.10 * cartTotal;

            double newPrice = cartTotal - discount;
            
            return newPrice;
        
        }else if (cartTotal >= 15000 && cartTotal < 30000 && promoCode .equals("BIGBOY20")) {
        
            double discount = 0.20 * cartTotal;

            double newPrice = cartTotal - discount;
            
            return newPrice;    

        }else if (cartTotal >= 30000 && promoCode .equals("OSHOFREE35")) {
        
            double discount = 0.35 * cartTotal;

            double newPrice = cartTotal - discount;
            
            return newPrice;    

        }else{
        
            return cartTotal;
                    
        }
        


    }



}
