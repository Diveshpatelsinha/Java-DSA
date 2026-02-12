
import java.util.Scanner;

public class SumOfArray {
    
    static void sum(int arr[]){
         
         int sum = 0;
        for(int i = 0 ; i<arr.length ; i++){
             sum = sum + arr[i];
        }

        System.out.println("The sum of array is: "+sum);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the length of Array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
       

        System.out.println("Start entering array numbers:-");
        for(int i=0 ; i<n ; i++){
             arr[i] = sc.nextInt(); 
        }

        sum(arr);
       
    }
}
