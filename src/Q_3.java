import java.util.Scanner;

public class Q_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of array:");
        int n = sc.nextInt();
        int a[] = new int[n];

        System.out.println("Enter Elements:");
        for (int i = 0;i<n;i++){
            a[i] = sc.nextInt();
        }

        System.out.println("Enter value of K:");
        int k = sc.nextInt();

        kthMax(a,k);
        kthMin(a,k);

    }

    static void sortArray(int a[]){
        for (int i = 0; i < a.length; i++) {
           for(int j=i ; j>0 && a[j-1] > a[j] ; j--) {
                int temp = a[j];
                a[j] = a[j - 1];
                a[j - 1] = temp;

            }
        }
    }

    static void kthMax(int a[],int k){
        sortArray(a);
        System.out.println(k+ " Max: "+a[a.length - k]);
    }

    static void kthMin(int a[],int k){
        sortArray(a);
        System.out.println(k+" Min: "+a[k-1]);
    }

}
