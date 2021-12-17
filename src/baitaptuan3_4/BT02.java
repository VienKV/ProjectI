package baitaptuan3_4;

import java.util.*;

public class BT02 {
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
        
        System.out.println("Cac so nguyen to cua day so la: ");
        for(int i=0; i<arr.length; i++){
            if(arr[i]<=1) continue;
            boolean isPrime = true;
            for (int j=2; j<arr[i]; j++){
                if(arr[i]%j==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime)
            System.out.println(arr[i] + " ");
        }
        System.out.println("\nVien Dinh Khuong 20183567");
    }
}
