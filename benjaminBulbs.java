import java.util.*;

public class benjaminBulbs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        // boolean arr[] = new boolean[n + 1];
        // for (int i = 1; i <= n; i++) {
        // arr[i] = false;
        // }
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n; j++) {
        // if ((j % i) == 0)
        // arr[j] = !arr[j];
        // }
        // }
        // System.out.println("Bulbs that will be switched on:");
        // for (int i = 1; i <= n; i++) {
        // if (arr[i]) {
        // System.out.print("b" + i + " ");
        // }
        // }

        for (int i = 1; i <= Math.sqrt(n); i++) {
            System.out.print("b" + i * i + " ");
        }

        sc.close();
    }
}
