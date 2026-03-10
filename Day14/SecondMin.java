public class SecondMin {
    public static void main(String[] args){
        int[] arr = {1,5,7,2,8,9,3};

        int min = arr[0];

        for(int i = 0; i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }

        int secondMin = arr[0];
        for(int i = 0; i<arr.length;i++){
            if(arr[i]!=min){
                secondMin = arr[i];
                break;
            }
        }
        // int secondMin = Integer.MAX_VALUE;
         for(int i = 0; i<arr.length;i++){
            if(arr[i]>min && arr[i]<secondMin){
                secondMin = arr[i];
            }
         }

         System.out.println(secondMin);

    }
}
