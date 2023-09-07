//find Largest sum contiguous Subarray
import java.util.Scanner;



public class Q_8 {
    public static void main(String[] args) {
        int sum =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements in array:");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter Elements of Array:");
        for (int i = 0 ;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int maxi = arr[0];

        for(int i =0 ; i<arr.length;i++){
            sum = sum + arr[i];

            maxi = max(maxi,sum);

            if (sum < 0){
                sum = 0;
            }
        }
        System.out.println("Largest Sum is "+maxi);
    }
    static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}
