import java.util.*;

public class pattern15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        for (int i = 1; i <= (n / 2) + 1; i++) {
            for (int k = 1; k <= (n / 2) + 1 - i; k++) {
                System.out.print(" ");
            }
            int c = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(c);
                c++;
            }
            c = c - 2;
            for (int l = 1; l <= (i - 1); l++) {
                System.out.print(c);
                c--;
            }
            System.out.println();
        }
        for (int i = n / 2; i >= 1; i--) {
            for (int k = 1; k <= (n / 2) + 1 - i; k++) {
                System.out.print(" ");
            }
            int c = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(c);
                c++;
            }
            c = c - 2;
            for (int l = 1; l <= (i - 1); l++) {
                System.out.print(c);
                c--;
            }
            System.out.println();
        }
        sc.close();
    }
}
