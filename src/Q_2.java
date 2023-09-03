import java.util.Scanner;

public class Q_2 {
    public int max(int [] array) {
        int max = 0;

        for(int i=0; i<array.length; i++ ) {
            if(array[i]>max) {
                max = array[i];
            }
        }
        return max;
    }
    public int min(int [] array) {
        int min = array[0];

        for(int i=0; i<array.length; i++ ) {
            if(array[i]<min) {
                min = array[i];
            }
        }
        return min;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size of Array:");
        int n = sc.nextInt();

        int []array = new int[n];

        System.out.println("Enter elements:");
        for (int i =0;i<n;i++){
            array[i] = sc.nextInt();
        }
        Q_2 m = new Q_2();
        System.out.println("Maximum value in the array is::"+m.max(array));
        System.out.println("Minimum value in the array is::"+m.min(array));
    }
}