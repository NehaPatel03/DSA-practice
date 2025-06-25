import java.util.Scanner;

public class primeFactorization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        // dividend = (divisor * quotient) + remainder
        // int i = 2;
        // while (num >= i) {
        // if (num % i == 0) {
        // num = num / i;
        // System.out.print(i + " ");
        // } else {
        // i += 1;
        // }
        // }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            while (num % i == 0) {
                num = num / i;
                System.out.print(i + " ");
            }
        }
        if (num != 1) {
            System.out.print(num);
        }
        sc.close();
    }
}
