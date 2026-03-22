import java.util.*;
public class FirstRepeating{
    public static void main(String[] args){
        String s = "deepak";
        HashSet<Character> set = new HashSet<>();

        for(char ch : s.toCharArray()){
            if(set.contains(ch)){
                System.out.println("first repeating character is: "+ch);
                return;
            }
            set.add(ch);
        }
        System.out.println("no character is repeating");

    }
}