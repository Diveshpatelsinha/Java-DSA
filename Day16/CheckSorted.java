public class CheckSorted {
    public static void main(String[] args) {
        int[] a = {1,3,5,3,2,5,6,8};

        boolean sorted = true;
        for(int i = 1; i<a.length; i++){
            if(a[i]<a[i-1]){
                sorted = false;
               
            }
        }
        if(!sorted) System.out.println("not sorted");
    }
    
}
