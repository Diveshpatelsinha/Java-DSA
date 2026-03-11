import java.util.Scanner;
public class LeftShiftByK {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6};
        System.out.print("Enter the number till which you want to shift: ");
        int k = sc.nextInt();

        for(int i = 1;i<=k;i++){
            int first = arr[0];

            for(int j = 0; j<arr.length-1;j++){
                arr[j] = arr[j+1];
            }
            arr[arr.length-1] = first;
        }

        for(int num : arr){
            System.out.print(num + " ");
        }

    }
}
