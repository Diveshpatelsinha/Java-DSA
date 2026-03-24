public class ReverseSentence2 {
    public static void main(String[] args) {
       String s = "I love java";
    String rev = "";

    for(int i=s.length()-1; i>=0;i--){
        char c = s.charAt(i);
        rev+=c;
    }  

    System.out.println(rev);
    }
   
}
