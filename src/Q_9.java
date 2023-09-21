import java.util.Scanner;
import java.lang.Math.*;

//Minimise the maximum difference between heights [V.IMP]
public class Q_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        System.out.println("Enter value of K for increasing or decreaing heigths:");
        int k = sc.nextInt();

        int a[] = new int[n];
        System.out.println("Enter Elements of array :");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }


        sortArray(a);
        int ans = find(a,k,n);
        System.out.println("Maximumm Diffrenece of Heights: "+ans);
    }

    static int find(int a[],int n,int k){
        int ans = a[n-1] - a[0];

        int small = a[0]+k;
        int large = a[n-1] + k;
        int mi,ma;

        for (int i = 0 ; i<n-1; i++){
            mi = Math.min(small,a[i+1]-k);
            ma = Math.max(large,a[i]+k);

            if(mi<0) continue;

            ans = Math.min(ans,ma-mi);
        }
        return ans;

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
}
