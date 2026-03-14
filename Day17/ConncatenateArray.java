public class ConncatenateArray {
    static int[] merge(int[] arr1, int[] arr2){
        int[] result = new int[arr1.length + arr2.length];
        int k = 0;

        for(int i = 0; i<arr1.length;i++){
            result[k] = arr1[i];
            k++;
        }

         for(int i = 0; i<arr2.length;i++){
            result[k] = arr2[i];
            k++;
        }
        return result;
    }

    public static void main(String[] args) {

        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6};

        int[] merged = merge(arr1, arr2);

        for (int num : merged) {
            System.out.print(num + " ");
        }
    }
}

