import java.util.*;
public class FirstNonRepeating{
    public static void main(String[] args){
        String s = "aditya";

        HashMap<Character, Integer> mp = new HashMap<>();

        for(char ch : s.toCharArray()){
            mp.put(ch, mp.getOrDefault(ch,0)+1);
        }

        for(char ch : s.toCharArray()){
            if(mp.get(ch)==1){
                System.out.println("first non repeating number is: "+ ch);
                return;
            }
        }
         System.out.println("no non repeating number");
    }
}