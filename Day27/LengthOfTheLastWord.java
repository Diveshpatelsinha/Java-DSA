//leetcode problem 58

class Solution {
    public int lengthOfLastWord(String s) {
        String[] arr  =  s.split(" ");
        
        String l = arr[arr.length-1];

        int count=0;
       for (int i = 0; i < l.length(); i++) {
           count++;
       }
       return count;
    }
}
