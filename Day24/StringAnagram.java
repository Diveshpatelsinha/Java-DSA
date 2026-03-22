public class StringAnagram{
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "islted";
        boolean a = true;

        int[] freq = new int[26];

        if(s1.length()!=s2.length()){
            a = false;
            return;
        }

        for(char ch : s1.toCharArray()){
            freq[ch-'a']++;
        }

         for(char ch : s2.toCharArray()){
            freq[ch-'a']--;
        }

        for(int f : freq){
            if(f!=0){
                a = false;
               break;
            }
        }

        if(!a){
            System.out.println("not anagram");
        }
        else System.out.println("anagram");
        


    }
}