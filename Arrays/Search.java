public class Search {
    public static void main(String[] args){
        int[] arr = {2,4,5,3,6,8,9};
        int k = 3;
        for(int i = 0; i<arr.length;i++){
            if(arr[i]==k){
                System.out.println("K is found at" + arr[i] + " position");
                return;
            }
        }
        System.out.println("not found");
        
    }
}
