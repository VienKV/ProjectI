package baitaptuan3_4;

import java.util.*;

public class BT01 {
    public static void main(String[] args){
        System.out.print("Nhap so phan tu cua mang: ");
        Scanner sc1 = new Scanner(System.in);
        int n=sc1.nextInt();
        int[] arr = new int[n];
        System.out.println("Nhap cac phan tu cua mang: ");
        for(int i=0; i<n; i++){
            //System.out.printf("arr[%d] = ", i);
            arr[i]=sc1.nextInt();
        }
        sortDESC(arr);
        System.out.println("Day so duoc sap xep giam dan: \n");
        show(arr);
        System.out.println("\nVien Dinh Khuong 20183567");
    }
     public static void sortDESC(int [] arr) {
        int temp = arr[0];
        for (int i = 0 ; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
      
    public static void show(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
