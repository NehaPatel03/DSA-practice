import java.util.Scanner;

public class pattern14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.print("2 * " + i + " = " + n * i);
            System.out.println();
        }
        sc.close();
    }
}
