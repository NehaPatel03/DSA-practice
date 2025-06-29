import java.util.*;

public class findElArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of elements:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element you want to find:");
        int val = sc.nextInt();
        int flag = 0, index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val) {
                flag = 1;
                index = i;
                break;
            }
        }
        if (flag == 1) {
            System.out.println("Index: " + index);
        } else {
            System.out.println(-1);
        }
        sc.close();
    }
}
