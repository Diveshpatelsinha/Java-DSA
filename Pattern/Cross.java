public class Cross{
public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < n; i++) {          // rows
            for (int j = 0; j < n; j++) {      // columns

                if (i == j || i + j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
