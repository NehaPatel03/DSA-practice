import java.util.*;

public class inverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int number = n;
        int lastDigit = 0;
        int inverseNum = 0;
        int i = 1;
        while (number != 0) {
            lastDigit = number % 10;
            inverseNum = inverseNum + (int) (i * Math.pow(10, lastDigit - 1));
            number = number / 10;
            i = i + 1;
        }
        System.out.println(inverseNum);
        sc.close();
    }
}