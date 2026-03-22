import java.util.*;
public class FrequencyOfEachNum{
    public static void main(String[] args) {
        int[] arr = {1,3,5,3,2,5,1,7};

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : arr){
            map.put(num, map.getOrDefault(num, 0)+1);

        }
        for(int key : map.keySet()){
            System.out.println(key + " -> "+ map.get(key));
        }

    }
}