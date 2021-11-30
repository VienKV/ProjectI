package baitaptuan2_3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BT01_B {
    public static void main(String[] args) {
        int n;
        float sum = 0, temp = 0;
        Scanner scanner = new Scanner(System.in);
         
        // làm tròn đến 2 chữ số thập phân
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
         
        do {
            System.out.println("Nhap n: ");
            n = scanner.nextInt();
        } while (n < 1);
         

        for (int i = 1; i <= n; i++) {
            temp += i;  
            sum += (float) 1/temp;
        }
         
        System.out.println("S = " + decimalFormat.format(sum));
        System.out.println("\nVien Dinh Khuong 20183567");
    }
}
