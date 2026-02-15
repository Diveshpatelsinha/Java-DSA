package Day5;
import java.util.Scanner;
public class Palindrome{

    static boolean isPalindrome(int num){
        int original = num;
        int rev = 0;
        while(num>0){
            int digit = num%10;
            rev = rev*10+digit;
            num = num/10;
        }
        return original==rev;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number to check: ");
        int num = sc.nextInt();

        
        if(isPalindrome(num)){
            System.out.println("Its a palindrome!");
        }
        else{
            System.out.println("Its not a palindrome.");
        }

    }
}