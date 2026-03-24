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

//method 2
public class ReverseSentence{
    public static void main(String[] args){
     String s = "Sky is blue";
      String[] word = s.split(" ");
        String rev = "";
      for(int i = word.length-1;i>=0;i--){
       rev+= word[i]+" ";
      }

      System.out.println(rev);
    }
     
}
