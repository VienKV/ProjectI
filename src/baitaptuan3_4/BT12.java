package baitaptuan3_4;

import java.util.Scanner;

public class BT12 {
    public static Scanner scanner = new Scanner(System.in);

    public static boolean isSubSequence(int A[], int n, int B[], int m) {
        int i =0;
        int j =0;
        while(i<n && j<m){
            if(A[i] == B[j])i++;
            j++;
        }
        return i == n;
    }
    public static void main(String[] args){
        System.out.println("Nhap vao so phan tu cua day a: ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        System.out.print("Nhap cac phan tu cua day a: \n");
        for (int i = 0; i < n; i++) {
            //System.out.printf("a[%d] = ", i);
            a[i] = scanner.nextInt();
        }
        System.out.println("Nhap vao so phan tu cua day b: ");
        int m = scanner.nextInt();
        int[] b = new int[m];
        System.out.print("Nhap cac phan tu cua day b: \n");
        for (int i = 0; i < m; i++) {
            //System.out.printf("b[%d] = ", i);
            b[i] = scanner.nextInt();
        }
        if(isSubSequence(a, n, b, m)){
            System.out.println("a la day con cua b");
        }else {
            System.out.println("a khong phai la day con cua b");
        }
        System.out.println("\nVien Dinh Khuong 20183567");
    }
}
