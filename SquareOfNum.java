//find square of a number

import java.util.Scanner;

public class SquareOfNum {
    
    static void square(double a){
        System.out.println("The square of a number is: "+a*a);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        double s = sc.nextDouble();

        square(s);
    }
}
