import java.util.Scanner;

public class gcdAndLcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int ogNum1 = num1;
        int ogNum2 = num2;
        // Brute-force
        for (int i = num2; i > 0; i--) {
            if (num1 % i == 0 && num2 % i == 0) {
                System.out.println("GCD is " + i);
                break;
            }
        }
        // Optimal - Euclidean's algo --> gcd(a,b) = gcd(b, a%b)
        while ((num1 % num2) != 0) {
            int rem = num1 % num2;
            num1 = num2;
            num2 = rem;
        }
        int gcd = num2;
        int lcm = ogNum1 * ogNum2 / gcd;
        System.out.println("GCD is: " + gcd + " ,LCM is: " + lcm);
        sc.close();
    }
}
