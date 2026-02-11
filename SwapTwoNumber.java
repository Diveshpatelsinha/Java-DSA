// class SwapTwoNumber{
//     public static void main(String[] args){
//         int a = 10;
//         int b = 20;
//        // int c = 0;

//         System.out.println("Before Swapping a:"+a);
//         System.out.println("Before Swapping b:"+b);

//         //swap two number using 3rd variable 
//         // c = a;
//         // a = b;
//         // b = c;

//         //swap two number without 3rd variable
//         a = a+b;
//         b = a-b;
//         a = a-b;


//         System.out.println("After Swapping a:"+a);
//         System.out.println("After Swapping b:"+b);


//     }
// }


//Swap two numbers

import java.util.Scanner;
public class SwaptwoNum {
    static void Swap(int a, int b){
        int c = a;
            a = b;
            b = c;
          System.out.println("Swapped number is a = "+a+"  b = "+b);

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = sc.nextInt();

        System.out.print("Enter b: ");
        int b = sc.nextInt();

        System.out.println("You entered a = "+a+"  b = "+b);

        Swap(a,b);
       
    }
}

