import java.util.*;
public class DistinctElement{
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 1, 4, 2, 5};

        HashSet<Integer> set = new HashSet<>();

    for(int num: arr){

        set.add(num);
    }

    System.out.println("the number of distinct element in this array is: "+ set.size());
    }

    
}
