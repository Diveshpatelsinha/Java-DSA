public class UnionOfArray {
    public static void main(String[] args){
        int[] a = {1,2,3,3,4};
        int[] b = {2,4,5,5,6};

        for(int i = 0; i<a.length;i++){
            boolean duplicate = false;

            for(int j = 0; j<i;j++){
                if(a[i]==a[j]){
                    duplicate = true;
                    break;
                }
               
        }
            if(!duplicate){
                    System.out.print(a[i]+" ");
                }
            }
        
            for(int i = 0; i<b.length;i++){
            boolean found = false;
            
            for(int j = 0; j<a.length;j++){
                if(b[i]==a[j]){
                    
                    found = true;
                    break;
                }
             
               
        }
           boolean found1 = false;
                for(int k = 0; k<i;k++){
                if(b[i]==b[k]){
                    found1 = true;
                    break;
                }
               
        }
       
         if(!found && !found1 ){
           System.out.print(b[i]+" ");
                }
            }

    }
}

