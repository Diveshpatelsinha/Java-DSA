public class MedianOfTwoArrays{


    public static double findmedian(int[] a, int[] b){
        int n = a.length + b.length;
        int[] merge = new int[n];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i<a.length && j<b.length){
            if(a[i]<b[j])
                merge[k++] = a[i++];
            else
                merge[k++] = b[j++];
        }

        while(i<a.length){
             merge[k++] = a[i++];
        }

         while(j<b.length){
             merge[k++] = b[j++];
        }

        if(i%2==0){
            return (merge[n/2-1]+merge[n/2])/2;
        }
        else{
             return merge[n/2];
            }

            // for(int x : merge){
            //      System.out.print(x + " ");
            // }

    }


    public static void main(String[] args){
        int[] a = {1,4,5,3};
        int[] b = {8,3,9,0};

        System.out.println(findmedian(a,b));
       
        }
    }
