public class SecondLargest{

    public static void main(String[] args){

        int[] arr = {1,5,7,2,8,9,3,0};

        int max = arr[0];

        for(int i = 0; i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }

        int second = arr[0];

        for(int i = 0; i<arr.length;i++){
            if(arr[i]>second && arr[i]<max){
                second = arr[i];
            }
        }

        System.out.println(second);
    }
}
