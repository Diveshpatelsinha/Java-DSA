// 1️⃣ Banking System – Account + Operation

// A bank application performs operations based on account type and selected action.

// Input 1: Account Type

// 1 → Savings

// 2 → Current

// Input 2: Operation

// 1 → Deposit

// 2 → Withdraw

// 3 → Check Balance

// Rules:

// If Savings → Withdrawal limit ₹25,000

// If Current → No withdrawal limit

// Design a nested switch where:

// Outer switch → Account Type

// Inner switch → Operation

// Display appropriate messages and validation.


import java.util.Scanner;
public class Banking_System {
    
    static void Account_Type(String type, String operation){
        switch (type) {
            case "saving":System.out.println("You have saving account.");
            switch (operation) {
                case "deposit":System.out.println("You can deposit any amount.");
                    break;
                    case "withdraw":System.out.println("Your withdrawl limit is $25,000.");
                    break;
                    case "check balance":System.out.println("Your balance is 5******.");
                    break;
                default:
                    System.out.println("Enter valid operation");
            }
                
                break;
                case "current":System.out.println("You have current account.");
            switch (operation) {
                case "deposit":System.out.println("You can deposit any amount.");
                    break;
                    case "withdraw":System.out.println("you have no withdrawl limit.");
                    break;
                    case "check balance":System.out.println("Your balance is 5******.");
                    break;
                default:
                    System.out.println("Enter valid operation!");
            }
                
                break;
            default:
                System.out.println("Enter valid Account Type!");
        }
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Account type: ");
        String type = sc.nextLine();
        System.out.print("Enter the Operation: ");
        String operation = sc.nextLine();

        Account_Type(type, operation);
    }
}
