import java.util.*;

public class anyToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number and a base");
        int n = sc.nextInt();
        int b = sc.nextInt();
        int i = 0;
        int conv = 0;
        while (n != 0) {
            int lastDig = n % 10;
            conv = (int) (conv + lastDig * Math.pow(b, i));
            n = n / 10;
            i++;
        }
        System.out.println("Converted number is:" + conv);
        sc.close();

    }
}
