package Day6;
import java.util.Scanner;

public class RemoveSpace{

    static String removeSpaces(String s){
        String result = "";

        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch!=' '){
                result += ch;
            }
        }
        return result;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string or a sentence: ");
        String s = sc.nextLine();

        String r = removeSpaces(s);
        System.out.println("String after removing space looks like this: "+r);

    }
}