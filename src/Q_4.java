//Given an array which consists of only 0, 1 and 2. Sort the array without using any sorting algo

import java.util.Scanner;

public class Q_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a[] = {0,1,0,1,2,1,2};
        int zero=0,one=0,two=0;

        for(int i=0;i<a.length;i++){
            if(a[i] == 0) zero++;
            if(a[i] == 1) one++;
            if(a[i] == 2) two++;
        }

        for (int i =0 ;i<zero;i++) a[i] = 0;
        for (int i = zero; i<one+zero;i++) a[i] = 1;
        for(int i=one+zero;i<a.length;i++) a[i] = 2;

        for(int i=0;i<a.length;i++) {
            System.out.println(a[i]);
        }
    }
}
