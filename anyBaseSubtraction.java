import java.util.Scanner;

public class anyBaseSubtraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers and a base");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int b = sc.nextInt();
        int sub = 0;
        int num = 0, i = 0, carry = 0;
        while (Math.max(n1, n2) != 0) {
            int lastDigfirst = n2 % 10;
            int lastDigsecond = n1 % 10;
            if (lastDigfirst - lastDigsecond + carry < 0) {
                lastDigfirst = lastDigfirst + b;
                sub = lastDigfirst - lastDigsecond + carry;
                num = (int) (num + sub * Math.pow(10, i));
                carry = -1;
            } else {
                sub = lastDigfirst - lastDigsecond + carry;
                num = (int) (num + sub * Math.pow(10, i));
                carry = 0;
            }
            n2 = n2 / 10;
            n1 = n1 / 10;
            i++;
        }
        System.out.println("Subtraction is: " + num);
        sc.close();
    }
}
