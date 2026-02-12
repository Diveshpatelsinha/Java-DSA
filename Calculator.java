
import java.util.Scanner;

public class Calculator {
    
    static int add(int a, int b){
        return a+b;
    }
    static int minus(int a, int b){
        return a-b;
    }
    static int mul(int a, int b){
        return a*b;
    }
    static int div(int a, int b){
        return a/b;
    }

    static void calculation(int a, char c, int b){
        double result = 0;
        switch (c) {
            case '+':result = add(a, b);
                break;
                case '-':result = minus(a, b);
                break;
                case '*':result = mul(a, b);
                break;
                case '/':result = div(a, b);
                break;
            default:
                System.out.println("Enter the valid operation!!.");
        }
        System.out.println("The result is: "+result);
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter the Operation: ");
        char c = sc.next().charAt(0);
        System.out.print("Enter b: ");
        int b = sc.nextInt();

        calculation(a, c, b);

    }
}
