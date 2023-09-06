//Find the Union and Intersection of the two sorted arrays.
public class Q_6 {
    public static void findUnion(int[] arr1, int[] arr2) {
        int m = arr1.length;
        int n = arr2.length;
        int i = 0, j = 0;

        while (i < m && j < n) {
            if (arr1[i] < arr2[j]) {
                System.out.print(arr1[i] + " ");
                i++;
            } else if (arr1[i] > arr2[j]) {
                System.out.print(arr2[j] + " ");
                j++;
            } else {
                System.out.print(arr1[i] + " ");
                i++;
                j++;
            }
        }

        while (i < m) {
            System.out.print(arr1[i] + " ");
            i++;
        }

        while (j < n) {
            System.out.print(arr2[j] + " ");
            j++;
        }
    }

    public static void findIntersection(int[] arr1, int[] arr2) {
        int m = arr1.length;
        int n = arr2.length;
        int i = 0, j = 0;

        while (i < m && j < n) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr1[i] > arr2[j]) {
                j++;
            } else {
                System.out.print(arr1[i] + " ");
                i++;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 1,2, 3, 4, 5,6};
        int[] arr2 = {2, 3, 5, 7};
        System.out.print("Union: ");
        findUnion(arr1, arr2);
        System.out.print("Intersection: ");
        findIntersection(arr1,arr2);
    }
}
