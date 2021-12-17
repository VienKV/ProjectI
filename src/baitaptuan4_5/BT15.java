package baitaptuan4_5;

import java.util.Scanner;

public class BT15 {
     public static void main(String[] args){
        System.out.println("Nhap vao xau S1: ");
        Scanner sc1 = new Scanner (System.in);
        String str1 = sc1.next();
        System.out.println("Nhap vao xau S2: ");
        Scanner sc2 = new Scanner (System.in);
        String str2 = sc2.next();
        int i = str2.length();
        int j = i/2;

        System.out.println("Xau sau khi tron S1 vao giua S2 : ");
        if (i % 2 == 0){
            System.out.println(str2.substring(0,j) + str1 + str2.substring(j-1,(str2.length() - 1)));
        }else {
            System.out.println(str2.substring(0,j) + str1 + str2.substring(j,(str2.length() - 0)));
        }
        System.out.println("\nVien Dinh Khuong 20183567");
    }
}
