import java.util.Scanner;

public class anyToany {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number, base1 and base2:");
        int n = sc.nextInt();
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();
        int i = 0;
        int conv1 = 0;
        while (n != 0) {
            int lastDig = n % 10;
            conv1 = (int) (conv1 + lastDig * Math.pow(b1, i));
            n = n / 10;
            i++;
        }
        int conv2 = 0;
        int j = 0;
        while (conv1 != 0) {
            int rem = conv1 % b2;
            conv2 = (int) (conv2 + rem * Math.pow(10, j));
            conv1 = conv1 / b2;
            j++;
        }
        System.out.println("Converted number is:" + conv2);
        sc.close();

    }
}
