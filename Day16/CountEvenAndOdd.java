public class CountEvenAndOdd {
    public static void main(String[] args) {
        int e = 0;
        int o = 0;
        int[] arr = {1,2,3,4,5,6,7,8,9};

        for(int x : arr){
            if(x%2==0) e++;
            else o++;
        }
        System.out.println("even: "+e+ " odd: "+o);
    }
    
}
