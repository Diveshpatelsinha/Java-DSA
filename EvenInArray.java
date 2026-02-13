package Day2;

import java.util.Scanner;
public class EvenInArray {
    
    static int CountEven(int arr[]){
        int count = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i]%2==0){
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter "+n+" numbers:--");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        
        }

        int num = CountEven(arr);
        System.out.println("There are "+num+" even numbers in this array.");

    }
}
