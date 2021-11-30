package baitaptuan4_5;

import java.util.Scanner;

public class BT05 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Nhap vao xau nhi phan :");
        String str = scanner.nextLine();
        String result = "";
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '0'){
                result += "1";
            }else {
                result += "0";
            }
        }
        System.out.println("Xau hoan doi la :\n" + result);
        System.out.println("\nVien Dinh Khuong 20183567");
    }
}
