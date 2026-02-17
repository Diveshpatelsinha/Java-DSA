package Day3;
import java.util.Scanner;
public class CapitalizeFirstLetter {
    static String capitalize(String s){
        String words[] = s.split(" ");
        String result = "";

        for(String word:words){
            result+=Character.toUpperCase(word.charAt(0))+word.substring(1)+" ";
        }
        return result.trim();
    }



    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the sentence which first letter you want to capitalise: ");
        String s = sc.nextLine();
        String r = capitalize(s);
        System.out.println(r);

    }
}
