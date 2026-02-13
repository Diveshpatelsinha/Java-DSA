package Day2;

import java.util.Scanner;
public class MaxInArray {
    
    static int max(int arr[]){
        int max = arr[0];

        for(int i = 0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }



    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        
        System.out.println("Enter "+n+" Elements:--");

        for(int i= 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

       int greatest =  max(arr);
       System.out.println("The greatest number in Array is: "+greatest);
    }
}
