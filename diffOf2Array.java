import java.util.Scanner;

public class diffOf2Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of elements of first array:");
        int n1 = sc.nextInt();
        int arr1[] = new int[n1];
        System.out.println("Enter the elements of first array:");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter the no. of elements of second array:");
        int n2 = sc.nextInt();
        int arr2[] = new int[n2];
        System.out.println("Enter the elements of second array:");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        int max = Math.max(n1, n2), startInd = 0;
        int c[] = new int[max];
        if (max == n1) {
            for (int i = 0; i < (n1 - n2); i++) {
                c[i] = arr1[i];
                startInd = n1 - n2;
            }
            for (int i = startInd; i < max; i++) {
                c[i] = arr2[i - startInd] - arr1[i];
            }
        } else {
            for (int i = 0; i < (n2 - n1); i++) {
                c[i] = arr2[i];
                startInd = n2 - n1;
            }
            for (int i = startInd; i < max; i++) {
                c[i] = arr2[i] - arr1[i - startInd];
            }
        }
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + "\t");
        }
        sc.close();
    }
}
