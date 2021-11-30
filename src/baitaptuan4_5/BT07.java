package baitaptuan4_5;

import java.util.Scanner;

public class BT07 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Nhap vao xau ki tu:");
        String str = scanner.nextLine();
        String result = "";
        for(int i = 0; i < str.length(); i++){
            if(Character.isDigit(str.charAt(i))){
                result += "$";
            }else{
                result += Character.toString(str.charAt(i));
            }
        }
        System.out.println("Xau ki tu moi la: " + result);
        System.out.println("\nVien Dinh Khuong 20183567");
   }
}
