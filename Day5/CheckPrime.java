package Day5;
import java.util.Scanner;
public class CheckPrime{

    static void check(int n){
    if(n<=1){
        System.out.println("Not a prime number");
        return;
    }
        boolean isprime = true;
        for(int i = 2; i<=Math.sqrt(n); i++){
            if(n%i==0){
               
                isprime =  false;
                break;
            }
        }
       if(isprime){
         System.out.println("Its a prime number");
       }
       else{
         System.out.println("Its not a prime number");
       }
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number to check: ");
        int n = sc.nextInt();

        check(n);
       

    }
}