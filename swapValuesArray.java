import java.util.*;

public class swapValuesArray {
    public static void swap(int[] a, int ind1, int ind2) {
        int temp;
        temp = a[ind1];
        a[ind1] = a[ind2];
        a[ind2] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of elements:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the indices that you want to swap:");
        int ind1 = sc.nextInt();
        int ind2 = sc.nextInt();
        System.out.println(Arrays.toString(arr));
        swap(arr, ind1, ind2);
        // for (int el : arr) {
        // System.out.print(el + " ");
        // }
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
}
