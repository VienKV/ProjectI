package baitaptuan3_4;

import java.util.Scanner;

public class BT10 {
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
        int cnt = 1;
        int index_curr = 0;
        int maxCnt = 0;
        for(int i = 1; i < n; i++){
            if(arr[i] == arr[i-1]){
                cnt++;
                if(maxCnt < cnt) {
                    maxCnt = cnt;
                    index_curr = i - 1;
                }
            }else {
                cnt = 1;
            }
        }
        System.out.println("\nSo phan tu day con bang nhau dai nhat la: " + maxCnt);
        System.out.println("Chi so phan tu dau tien la : " + (index_curr - maxCnt + 2));
        System.out.println("\nVien Dinh Khuong 20183567");
    }
}
