
import java.util.Scanner;
public class Fibonacci{

    // public static void main(String[] args){
    //     int n1 = 0;
    //     int n2 = 1;
    //     int i = 1;

    //     while(i<10){
    //         System.out.print(n1+" ");
    //         int n3 = n1+n2;
    //         n1 = n2;
    //         n2 = n3;

    //         i++;
    //     }
    // }



    static int Fib(int n){
        int n1 = 0;
        int n2 = 1;
        int i = 1;
         while(i<n){
            int n3 = n1+n2;
            n1 = n2;
            n2 = n3;
            i++;

    }
    return n1;
}

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int x = Fib(n);

        System.out.println(x);

    }

}
