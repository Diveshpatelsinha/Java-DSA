public class Discount_Calculator{

    public static double calculate(double amount){
        double discount;
         if(amount<=1000){
            discount = (amount*5)/100;
            
        }
        else if(amount > 1000 && amount <= 5000){
            discount = (amount*10)/100;
            
          }
           else {
            discount = (amount*15)/100;
           
          }
          return Math.round(discount*100)/100;
    }
    
    public static void main(String[] args){
        double amount = 6000;

        double finalprice = amount-calculate(amount);
        System.out.println(finalprice);
       
    }
}