//find Largest sum contiguous Subarray
import java.util.Scanner;



public class Q_8 {
    public static void main(String[] args) {
        int sum =0;
        Scanner sc = new Scanner(System.in);


        int arr[] = {5,4,-1,7,8};
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
