package Day6;
import java.util.Scanner;

public class AnagramCheck{
    static boolean check(String s1, String s2){
        if(s1.length()!=s2.length())
            return false;

        int freq[] = new int[256];

        for(int i = 0; i<s1.length();i++){
            freq[s1.charAt(i)]++;
        }
         for(int i = 0; i<s2.length();i++){
            freq[s1.charAt(i)]--;

        }

        for(int i = 0;i<256; i++){
            if(freq[i]!=0){
                return false;
            }
        }
        return true;
    }



    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st String: ");
        String s1 = sc.nextLine();

        System.out.print("Enter 2nd String: ");
        String s2 = sc.nextLine();


        if(check(s1, s2)){
            System.out.println("These two string are Anagram.");
        }
        else{
            System.out.println("Not a Anagram!");
        }

    }
}