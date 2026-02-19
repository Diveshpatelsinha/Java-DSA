import java.util.Scanner;
public class StrongNumber {
   static int Find(int n){
    int num = n;
    
     int sum = 0;
    while(num>0){
        int digit = num%10;
        int fact = 1;
        for(int i = 1;i<=digit;i++){
            fact = fact*i;
        }
        sum = sum+fact;
        num = num/10;
       

    }
    return sum;
   }
    



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number to check: ");
        int n = sc.nextInt();

        int x = Find(n);
        // System.out.println(x);
        if(n==x){
            System.out.println("its a strong number");

        }
        else{
            System.out.println("its not a strong number");
        }

    }
}
