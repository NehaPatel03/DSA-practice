import java.util.Scanner;

public class barChartArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of elements:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int maxValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (maxValue < arr[i]) {
                maxValue = arr[i];
            }
        }
        for (int i = maxValue; i >= 1; i--) {
            for (int j = 0; j < arr.length; j++) {
                if (i <= arr[j]) {
                    System.out.print("*\t");
                } else {
                    System.out.print(" \t");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
