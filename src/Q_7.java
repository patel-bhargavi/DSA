//Write a program to cyclically rotate an array by one.

import java.util.Scanner;

public class Q_7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of array:");
        int n = sc.nextInt();

        int []arr = new int[n];
        System.out.println("Enter Elements:");
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        cyclicallyRotate(arr);
    }
    static void cyclicallyRotate(int arr[]) {

        int temp = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            if (i > 0)
                arr[i] = arr[i - 1];
        }

        arr[0] = temp;

        System.out.println("After Cyclically rotated array");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }
}