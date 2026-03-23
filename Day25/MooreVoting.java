public class MooreVoting{
    public static void main(String[] args){
        int[] arr = {1,3,1,2,3,1,2};

        int candidate = 0;
        int count = 0;
            for(int num : arr){
            if(count == 0){
                candidate = num;
            }
            if(num == candidate){
                count++;
            }
            else {
                count--;
                }
            
        }

        count =0;

        for(int num: arr){
            if(num==candidate){
                count++;
            }
        }
        if(count>arr.length/2){
            System.out.println("Majority element is: "+ candidate);
        }
        else System.out.println("No majority element");
    }
}
