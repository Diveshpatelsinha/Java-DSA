import java.util.Scanner;
public class AreaOfCircle {

    static double Area(double r){
        return 3.14*r*r;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of circle: ");
        double r = sc.nextInt();

        double area = Area(r);
        System.out.println("The area of circle is: "+area);
    }
}

