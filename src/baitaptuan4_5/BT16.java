package baitaptuan4_5;

import java.util.Scanner;

public class BT16 {

    static boolean isSubSequence(String str1, String str2,int m, int n){
        int j = 0;

        for (int i = 0; i < n && j < m; i++)
            if (str1.charAt(j) == str2.charAt(i))
                j++;

        return (j == m);
    }
 
    public static void main(String[] args){
        System.out.println("Nhap vao xau S1: ");
        Scanner sc1 = new Scanner (System.in);
        String str1 = sc1.next();
        System.out.println("Nhap vao xau S2: ");
        Scanner sc2 = new Scanner (System.in);
        String str2 = sc2.next();

        int m = str1.length();
        int n = str2.length();
        boolean res = isSubSequence(str1, str2, m, n);
        System.out.println("S1 la con cua xau S2 : ");
        if (res)
            System.out.println("Yes");
        else
            System.out.println("No");
                
        System.out.println("\nVien Dinh Khuong 20183567");
    }
}
