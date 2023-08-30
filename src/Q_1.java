//Reverse the array

import java.util.Scanner;

public class Q_1 {

    public static void main(String[] args) {

        System.out.println("Enter Size Of Array:");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a[] = new int[n];

        System.out.println("Enter the element of array:");

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        reverse(a);
    }

    static void reverse(int a[]) {
        int start = 0;
        int end = a.length - 1;

        while (end > start) {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;

            start++;
            end--;
        }
        System.out.println("Reversed Array:");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }
}