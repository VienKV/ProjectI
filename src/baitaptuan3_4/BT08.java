package baitaptuan3_4;

import java.util.*;

public class BT08 {
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
        System.out.println("Cac phan tu cua day so khi bo di nhung phan tu bang 0 la:");
        for(int i = 0; i<arr.length;i++){
            if(arr[i]==0)continue;
            if(arr[i] != 0)
                System.out.print(arr[i] + " ");
        }
        
        System.out.println("\nVien Dinh Khuong 20183567");
    }
}
