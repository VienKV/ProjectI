package baitaptuan3_4;

import java.util.*;

public class BT06 {
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
        System.out.println("\nSo hang thoa man so nay la uoc so thuc su cua so khac trong day la ");
        for(int i=0; i<arr.length; i++){
            if(arr[i]==1)continue;
            for (int j=0; j<arr.length; j++){
                if(arr[j]==1)continue;
                if(arr[i]==arr[j])continue;
                if(arr[j]%arr[i]==0){
                    System.out.print(arr[i]+" ");
                    break;
                }
            }
            
        }
        System.out.println("\nVien Dinh Khuong 20183567");
    }
}
