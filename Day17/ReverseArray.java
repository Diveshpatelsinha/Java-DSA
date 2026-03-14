public class ReverseArray {
    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = arr[start];
            start++;
            end++;
        }
    }


    public static void main(String[] args) {
        int[] arr = {1,2,3,4};

        reverse(arr);
        for(int num: arr){
            System.out.print(num + " ");
        }

    }
}
