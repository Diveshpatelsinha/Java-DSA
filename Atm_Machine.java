// 3 ATM Machine Options

// ATM shows:

// 1 → Check Balance

// 2 → Withdraw

// 3 → Deposit

// 4 → Mini Statement

// 5 → Exit

// Write a switch-case program that displays the selected operation.


import java.util.Scanner;

public class Atm_Machine {
    static void check(int num){
        switch (num) {
                case 1: System.out.println("Check Balance");
                break;
                case 2: System.out.println("Check Balance");
                break;
                case 3: System.out.println("Check Balance");
                break;
                case 4: System.out.println("Check Balance");
                break;
                case 5: System.out.println("Check Balance");
                break;

            default:
                System.out.println("Invalid Option");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the option: ");
        int num = sc.nextInt();

        check(num);
    }
}
