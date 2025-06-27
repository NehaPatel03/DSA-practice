import java.util.*;

public class freqOfDigit {
    public static int checkFreq(int n, int d) {
        int count = 0;
        while (n != 0) {
            int lastDig = n % 10;
            if (lastDig == d) {
                count++;
            }
            n = n / 10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number and a digit to know it's frequency:");
        int n = sc.nextInt();
        int d = sc.nextInt();
        int freq = checkFreq(n, d);
        System.out.println("Frequency of digit is: " + freq);
        sc.close();
    }
}
