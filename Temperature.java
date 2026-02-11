//Formula: F = (C × 9/5) + 32

import java.util.Scanner;

public class Temperature {
    
    static double Temp(double c){
        return (c*9/5)+32;
    //    double  f = (c * 9/5) + 32 ;
    //     System.out.println("Temperature in farenhiet is: " + f);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in celcius: ");
        double c = sc.nextDouble();

        double f = Temp(c);
        System.out.println("The temperature in fahrenheit is: "+ f);
    }
}
