//Move all the negative elements to one side of the array

import java.util.Scanner;

public class Q_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size Of Array:");
        int n = sc.nextInt();

        int a[] = new int[n];
        int b[] = new int[n];
        int left = 0;
        int right = a.length-1;

        System.out.println("Enter Elements of array:");
        for (int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }

        for (int i=0;i<n;i++){
            if (a[i] < 0){
                 b[left++] = a[i];
            }
            if(a[i] > 0){
                b[right--] = a[i];
            }
        }

        System.out.println("After Move:");
        for (int i=0;i<n;i++){
            System.out.println(b[i]);
        }

    }
}
