import java.util.Scanner;

 class Q_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of array:");
        int n = sc.nextInt();
        int i;

        int a[] = new int[n];

        System.out.println("Enter Elements of array:");
        for( i=0;i<n;i++){
            a[i] = sc.nextInt();
        }

        System.out.println("After Reversed");
        for ( i = a.length-1;i>=0;i--){
            System.out.println(a[i]+" ");
        }
    }
}
