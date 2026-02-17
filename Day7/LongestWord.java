package Day3;



import java.util.Scanner;
public class LongestWord {
    
    static String Find(String s){
        String Longest = "";
        String words[] = s.split(" ");

        for(int i = 0; i<words.length;i++){
            if(words[i].length()>Longest.length()){
                Longest = words[i];
            }
        }
        return Longest;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sentence: ");
        String s = sc.nextLine();
        String l = Find(s);
        System.out.println("The longest word is: "+l);
    }
}
