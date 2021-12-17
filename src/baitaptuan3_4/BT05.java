package baitaptuan3_4;

import java.util.*;

public class BT05 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        //System.out.print("Nhap so phan tu cua day so: ");
        int c_Prime =0; 
        int c_CpsNum = 0;
        int n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Nhap cac phan tu cua day so: ");
        for(int i=0; i<n; i++){
            //System.out.printf("arr[%d] = ", i);
            arr[i]=sc.nextInt();
        }
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
                c_Prime ++;
            else{
                c_CpsNum ++;
            }
        }
        System.out.println("\nTrong day co "+c_Prime+" so nguyen to va "+c_CpsNum+" hop so");
        System.out.println("\nVien Dinh Khuong 20183567");
    }
}
