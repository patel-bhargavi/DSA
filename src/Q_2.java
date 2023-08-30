//Find the maximum and minimum element in an array

import java.util.Scanner;

public class Q_2{


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size of array:");
        int n = sc.nextInt();

        int a[] = new int[n];

        System.out.println("Enter Elements of array:");
        for(int i = 0 ; i<n ; i++){
            a[i] = sc.nextInt();
        }
       maximum(a);
        minimum(a);
    }

    static void maximum(int a[]){
        int max = 0;

        for (int i=0;i<a.length-1;i++){
            if (a[i]>a[max]){
                System.out.println(a[i]+" Is Maximum");
            }
        }
    }

    static void minimum(int a[]){
        int min = 0;

        for (int i=0;i<a.length-1;i++){
            if (a[i]<a[min]){
                System.out.println(a[i]+" Is Minimum");
            }
        }
    }
}