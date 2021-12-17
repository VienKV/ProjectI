package baitaptuan3_4;

import java.util.*;

public class BT03 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        //System.out.print("Nhap so phan tu cua day so: ");
        int n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Nhap cac phan tu cua day so: ");
        for(int i=0; i<n; i++){
            //System.out.printf("arr[%d] = ", i);
            arr[i]=sc.nextInt();
        }
        int minValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
            }
        }
        System.out.println("Gia tri nho nhat cua day la: " + minValue);
        System.out.println("\nCac chi so ung voi gia tri nho nhat cua day la: ");
        for (int i = 1; i <= arr.length ; i++) {
            if (arr[i-1] == minValue) {
               System.out.println(" " + i);
            }
        }
        System.out.println("\nVien Dinh Khuong 20183567");
    }
}
