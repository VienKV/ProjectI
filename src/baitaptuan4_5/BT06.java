package baitaptuan4_5;

import java.util.Scanner;

public class BT06 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Nhap vao xau ku tu:");
        String str = scanner.nextLine();
        String result = "";
        for(int i = str.length() - 1; i >=0; i--){
            result += str.charAt(i);
        }
        System.out.println("Xau nguoc la:\n" + result);
        System.out.println("\nVien Dinh Khuong 20183567");
    }
}
