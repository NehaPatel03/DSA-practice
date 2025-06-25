import java.util.Scanner;

public class pattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        for (int i = 1; i <= (n / 2) + 1; i++) {
            for (int k = (n / 2) + 1; k >= i; k--) {
                System.out.print("*");
            }
            for (int j = 1; j <= (i * 2) - 1; j++) {
                System.out.print(" ");
            }
            for (int k = (n / 2) + 1; k >= i; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = (n / 2); i >= 1; i--) {
            for (int k = (n / 2) + 1; k >= i; k--) {
                System.out.print("*");
            }
            for (int j = 1; j <= (i * 2) - 1; j++) {
                System.out.print(" ");
            }
            for (int k = (n / 2) + 1; k >= i; k--) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
