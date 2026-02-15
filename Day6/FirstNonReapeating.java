package Day6;
import java.util.Scanner;
public class FirstNonReapeating{

    static char FindFirst(String s){
       // s = s.toLowerCase();
         int freq[] = new int[256];

        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            freq[ch]++;
        }
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(freq[ch]==1)
                return ch;
            
        }
        return '#';
    }


    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter the string: ");
       String s = sc.nextLine();

      char c =  FindFirst(s);
      if(c=='#'){
        System.out.println("No character repeats");
      }
      else{
        System.out.println("The first non repeating character is: "+c);
      }

        
    }
}