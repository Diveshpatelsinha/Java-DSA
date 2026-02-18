import java.util.Scanner;

public class Factors {

    static void printFactors(int num){

        System.out.println("Factors of " + num + " are:");

        for(int i = 1; i <= num; i++){
            if(num % i == 0){
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        printFactors(num);
    }
}
