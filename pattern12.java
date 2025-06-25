import java.util.*;

public class pattern12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(a + " ");
                sum = a + b;
                a = b;
                b = sum;
            }
            System.out.println();
        }
        sc.close();
    }
}
