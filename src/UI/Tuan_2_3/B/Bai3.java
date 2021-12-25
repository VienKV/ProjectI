/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UI.Tuan_2_3.B;


public class Bai3 {
    private static double p(int a) {
        int p = 1;
        double e = 0;
        for (int i = 1; i <= a; i++) {
            p *= i;
            e+=p;
        }
        double z = 1 / e;
        return z;
    }
    private static double s(int a){
        if(a==1)return 1;
        else return s(a-1)+p(a);
    }
    public static String bai3(int a){
        System.out.println("Tong S="+s(a));
        return String.valueOf(s(a));
    }
    public static void main(String[] args) {
        bai3(10);
    }
}
