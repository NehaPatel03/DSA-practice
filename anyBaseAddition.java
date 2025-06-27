import java.util.*;

public class anyBaseAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers and a base");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int b = sc.nextInt();
        int add = 0;
        int carry = 0;
        int num = 0, i = 0;
        while (Math.max(n1, n2) != 0) {
            int lastDigfirst = n1 % 10;
            int lastDigsecond = n2 % 10;
            add = lastDigfirst + lastDigsecond + carry;
            if (add > b) {
                add = add - b;
                num = (int) (num + add * Math.pow(10, i));
                carry = 1;
            } else {
                num = (int) (num + add * Math.pow(10, i));
                carry = 0;
            }
            n1 = n1 / 10;
            n2 = n2 / 10;
            i++;
        }
        if (carry == 1) {
            num = (int) (num + carry * Math.pow(10, i));
        }
        System.out.println("Sum is:" + num);
        sc.close();
    }
}
