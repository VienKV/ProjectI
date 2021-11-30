package baitaptuan4_5;

import java.util.Scanner;

public class BT02 {
    public static Scanner scanner = new Scanner(System.in);

    public static boolean isEmpty(String s) {
        return s == null || s.length() == 0;
    }

    public static int countMatches(String str, String sub_str) {
        if (isEmpty(str) || isEmpty(sub_str)) {
            return 0;
        }

        int index = 0, count = 0;
        while (true) {
            index = str.indexOf(sub_str, index);
            if (index != -1) {
                count++;
                index += sub_str.length();
            } else {
                break;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        System.out.println("Nhap vao xau ki tu: ");
        String str = scanner.nextLine();
        System.out.println("Nhap vao xau con: ");
        String sub_str = scanner.nextLine();
        int count = countMatches(str, sub_str);
        System.out.println("So lan xuat hien xau con " +sub_str+ " la : " + count);
        System.out.println("\nVien Dinh Khuong 20183567");
    }
}
