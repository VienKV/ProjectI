package baitaptuan4_5;

import java.util.Scanner;

public class BT08 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Nhap vao xau S1: ");
        String str1 = scanner.nextLine();
        System.out.println("Nhap vao xau S2: ");
        String str2 = scanner.nextLine();
        int count = 0;
        for(int i = 0; i <= str2.length() - str1.length(); i++){
            if(str2.substring(i, i + str1.length()).equals(str1)){
                count++;
            }
        }
        System.out.println("Xau S1 xuat hien trong xau S2 " + count + " lan");
        System.out.println("\nVien Dinh Khuong 20183567");
    }
}
