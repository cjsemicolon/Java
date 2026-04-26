public class BackToSender {

    public static int calculatePay(int successfulDeliveries) {
        int rate;

        if (successfulDeliveries < 50) {
            rate = 160;
        } else if (successfulDeliveries < 60) {
            rate = 200;
        } else if (successfulDeliveries < 70) {
            rate = 250;
        } else {
            rate = 500;
        }

        int totalPay = (successfulDeliveries * rate) + 5000;
        return totalPay;
    }

    public static void main(String[] args) {

        System.out.println(calculatePay(25)); 
        System.out.println(calculatePay(55)); 
        System.out.println(calculatePay(65)); 
        System.out.println(calculatePay(80));
    }
}
