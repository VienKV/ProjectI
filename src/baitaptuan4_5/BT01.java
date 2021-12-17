package baitaptuan4_5;

import java.util.Scanner;

public class BT01 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Nhap vao ho va ten:");
        String n = scanner.nextLine();
        System.out.print("Ho va ten sau khi xoa khoang trang thua : ");
        System.out.println(n.replaceAll("\\s\\s+", " ").trim());
        System.out.println("\nVien Dinh Khuong 20183567");
    }
}
