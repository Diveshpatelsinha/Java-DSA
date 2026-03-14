public class CheckSorted {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,4};

        boolean sorted = true;
        for(int i = 0; i<arr.length;i++){
            if(arr[i]>arr[i+1]){
                sorted = false;
            }
        }
        if(!sorted){
            System.out.println("not sorted");
        }
        else System.out.println("sorted");
    }
}
