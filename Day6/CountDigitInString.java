package Day6;
import java.util.Scanner;
public class CountDigitInString{

    static int count(String s){
        int count = 0;
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch>= '0' && ch<= '9'){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String s = sc.nextLine();

        int num = count(s);
        System.out.println("Total number of digits in this string is: "+num);
    }
}