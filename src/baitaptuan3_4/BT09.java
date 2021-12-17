package baitaptuan3_4;

import java.util.Scanner;

public class BT09 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){

        System.out.println("Nhap vao so phan tu cua mang: ");
        int n = scanner.nextInt();
        int [] arr = new int [n];
        System.out.print("Nhap cac phan tu cua mang: \n");
        for (int i = 0; i < n; i++) {
            //System.out.printf("a[%d] = ", i);
            arr[i] = scanner.nextInt();
        }
        System.out.println("\nNhap vao so nguyen C :");
        int c = scanner.nextInt();
        
        int cnt1 = 0;
        int cnt2 = 0;
        int cnt3 = 0;
        
        for(int i = 0; i < n; i++){
            if(arr[i] == c){ 
                cnt1++;
            }else if(arr[i]>c){
                cnt2++;
            }else {cnt3++;}
        }
        System.out.println("So cac so trong day bang " + c + " la: " + cnt1);
        System.out.println("So cac so trong day lon hon " + c + " la: " + cnt2);
        System.out.println("So cac so trong day be hon " + c + " la: " + cnt3);
        System.out.println("\nVien Dinh Khuong 20183567");
    }
}
