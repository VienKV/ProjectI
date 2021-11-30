package baitaptuan4_5;

import java.util.Scanner;

public class BT09 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Nhap vao xau :");
        String str = scanner.nextLine();
        
        int i, j;
        do {
            System.out.println("Nhap vao chi so i :");
            i = scanner.nextInt();
        } while (i > str.length());
        do {
            System.out.println("Nhap vao chi so j :");
            j = scanner.nextInt();
        } while (j > str.length());
        
        String result = "";
        if (i != j) {
            for (int k = 0; k < str.length(); k++) {
               if(k == i){
                   result += Character.toString(str.charAt(j));
               }else if (k == j){
                   result += Character.toString(str.charAt(i));
               }else {
                   result += Character.toString(str.charAt(k));
               }
            }
        }else{
            result = str;
        }
        System.out.println("Xau sau khi hoan doi la : " + result);
        System.out.println("\nVien Dinh Khuong 20183567");
    }
}
