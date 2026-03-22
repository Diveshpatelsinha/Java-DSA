// public class ElementWithOddFrequency{
//     public static void main(String[] args){
//         //using XOR-- works only for one odd element

//         int[] arr = {1,3,5,3,2,5,1};
//         int result = 0;
//         for(int x : arr){
//             result^=x;
//         }
//         System.out.println(result);
//     }
// }

import java.util.*;

public class ElementWithOddFrequency{
    public static void main(String[] args){
        int[] arr = {1,3,5,3,2,5,1,7};

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int x : arr){
            map.put(x, map.getOrDefault(x,0)+1);
        }
        for(int key : map.keySet()){
            if(map.get(key)%2 !=0){
                System.out.println(key);

            }
        }
    }
}