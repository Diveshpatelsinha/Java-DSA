public class ReverseSentence {
    public static void main(String[] args) {
        String s = "Sky is blue";
        String rev = "";
        String word = "";
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if(c!=' '){
              word+=c;
               
            }
            else{
                word+=c;
                rev = word+rev;
              word = ""; 
            }
        }
        word = word+" ";
        rev = word+rev;
        System.out.println(rev);
    }
}
