// 2 Restaurant Menu Selection

// A restaurant has the following menu:

// 1 → Idli

// 2 → Dosa

// 3 → Biryani

// 4 → Meals

// 5 → Ice Cream

// Write a program that reads the menu number and displays the selected item.
// If invalid choice → display “Invalid Menu Option”.
import java.util.Scanner;
public class Restaurant_Menu {
    static void menu(int num){
        switch(num){
            case 1:System.out.println("You selected Idli.");
            break;
            case 2:System.out.println("You selected Dosa.");
            break;
            case 3:System.out.println("You selected Biryani.");
            break;
            case 4:System.out.println("You selected Meals.");
            break;
            case 5:System.out.println("You selected Ice Cream.");
            break;
            default : System.out.println("Invalid Menu Option");
           
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Menu number: ");
        int num = sc.nextInt();

        menu(num);
    }
}
