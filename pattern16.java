import java.util.*;

public class pattern16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int k = 1; k <= n + (n - 1) - (2 * i); k++) {
                System.out.print(" ");
            }
            if (i == n) {
                for (int l = n - 1; l >= 1; l--) {
                    System.out.print(l);
                }
            } else {
                for (int l = i; l >= 1; l--) {
                    System.out.print(l);
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
