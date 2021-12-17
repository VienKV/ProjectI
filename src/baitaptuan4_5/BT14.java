package baitaptuan4_5;

import java.util.Scanner;

public class BT14 {
    
    //Xoay sang trái d ký tự
    static String leftrotate(String str, int d){
            String ans = str.substring(d) + str.substring(0, d);
            return ans;
    }
    
    // Xoay sang phải d ký tự
    static String rightrotate(String str, int d){
            return leftrotate(str, str.length() - d);
    }

    public static void main(String[] args) {
        String str1 = "1111100000";
        System.out.println("Ban muon xem xau thu: ");
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int k = n;
        while((k--) != 0){
            str1 = leftrotate(str1, 1);
        }
        System.out.println("Xau S"+n+" la:");
        System.out.println(str1);
        System.out.println("\nVien Dinh Khuong 20183567");
    }
}
