/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UI.Tuan_2_3.B;


public class Bai2 {

    private static double p(int a) {
        double x = 1;
        double z = 0;
        for (int i = 1; i <= a; i++) {
            x *= i;
        }
        z = 1 / x;
        return z;
    }

    private static double s(int a) {
        if (a == 1) {
            return 1;
        } else {
            return s(a - 1) + p(a);
        }
    }

    public static String bai2(int a) {
        System.out.println("tong S=");
        System.out.print("%.16f"+s(a));
        return String.valueOf(s(a));
    }

    public static void main(String[] args) {
        bai2(4);
    }
}
