import java.util.*;

public class rotateNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        System.out.println("Enter the number of rotations:");
        int k = sc.nextInt();
        int count = 0;
        int number = n;
        while (n != 0) {
            count = count + 1;
            n = n / 10;
        }
        int lastDigit = 0;
        int rotNum = number;

        if (k < 0) {
            for (int i = (count + k) % count; i > 0; i--) {
                lastDigit = rotNum % 10;
                number = rotNum / 10;
                rotNum = (int) (number + lastDigit * Math.pow(10, count - 1));
            }
        } else {
            for (int i = k % count; i > 0; i--) {
                lastDigit = rotNum % 10;
                number = rotNum / 10;
                rotNum = (int) (number + lastDigit * Math.pow(10, count - 1));
            }
        }
        System.out.print(rotNum);
        sc.close();
    }
}
