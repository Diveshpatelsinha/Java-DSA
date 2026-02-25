public class NumberPattern1{
public static void main(String[] args){
        int n = 5; 
        for(int i = 1;i<=n;i++){
            for (int j = 1;j<=n; j++){
                System.out.print(j+" ");  
                
                
                //with printing i we get 
                // 1 1 1 1 1 
                // 2 2 2 2 2 
                // 3 3 3 3 3 
                // 4 4 4 4 4 
                // 5 5 5 5 5  

                //with printing j we get
                // 1 2 3 4 5 
                // 1 2 3 4 5 
                // 1 2 3 4 5 
                // 1 2 3 4 5 
                // 1 2 3 4 5 
                
            }
            System.out.println();
        }
    }
}
