//leetcode problem 2529
class Solution {
    public int maximumCount(int[] nums) {
        int negative = 0;
        int positive = 0;
        int zeros = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i]==0){
                zeros++;
            }
            if(nums[i]>0){
                positive++;
            }
            if(nums[i]<0){
                negative++;
            }
        }
        if(negative>positive){
            return negative;
        }
        else{
            return positive;
        }
    }
}
