import java.util.Scanner;

public class anyBaseMulti {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers and a base");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int b = sc.nextInt();
        int value = 0, p = 1;
        while (n1 != 0) {
            int lastDigsecond = n1 % 10;
            int mulnum = singleDig(lastDigsecond, n2, b);
            value = add(value, mulnum * p, b);
            System.out.println(value);
            p = p * 10;
            n1 = n1 / 10;
        }
        System.out.println(value);
        sc.close();
    }

    public static int singleDig(int lastDigsecond, int n2, int b) {
        int num = 0, i = 0, carry = 0;
        System.out.println("lastdig is:" + lastDigsecond);
        System.out.println("n2 is (mul):" + n2);
        while (n2 != 0) {
            int lastDigfirst = n2 % 10;
            int mul = (lastDigfirst * lastDigsecond) + carry;
            if (mul >= b) {
                num = (int) (num + (mul % b) * Math.pow(10, i));
                carry = mul / b;
            } else {
                num = (int) (num + (mul) * Math.pow(10, i));
                carry = 0;
            }
            i++;
            n2 = n2 / 10;
        }
        if (carry > 0) {
            num = (int) (num + carry * Math.pow(10, i));

        }
        System.out.println("multi is:" + num);
        return num;
    }

    public static int add(int n1, int n2, int b) {
        int add = 0;
        int carry = 0;
        int num = 0, i = 0;
        System.out.println("n1 is" + n1);
        System.out.println("n2 is:" + n2);
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
        System.out.println("Addition is:" + num);
        return num;
    }
}
