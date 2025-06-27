import java.util.*;

public class decimalToBase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number and a base");
        int d = sc.nextInt();
        int b = sc.nextInt();
        int conv = 0;
        int i = 0;
        while (d != 0) {
            int rem = d % b;
            conv = (int) (conv + rem * Math.pow(10, i));
            d = d / b;
            i++;
        }
        System.out.println("Converted number is:" + conv);
        sc.close();
    }
}