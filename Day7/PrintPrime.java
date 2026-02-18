import java.util.Scanner;
public class PrintPrime {
    
    static boolean isPrime(int p){

        if(p<=1) return false;
     
        for(int i = 2; i<=Math.sqrt(p); i++){
            if(p%i==0){
                return false;
            }
        }
        return true;
    }

    static void printprime(int p){
        for(int i = 2; i<=p; i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number upto which prime numbers is required: ");
        int p = sc.nextInt();
        printprime(p);

    }
}
