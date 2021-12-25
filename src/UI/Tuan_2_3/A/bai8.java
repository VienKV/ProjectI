/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UI.Tuan_2_3.A;

import java.util.ArrayList;
import java.util.List;


public class bai8 {

    private static boolean check(int a) {
        if (a < 2) {
            return false;
        }
        for (int i = 2; i < a - 1; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static String bai8(int a) {
        List<Integer> list=new ArrayList<>();
        for (int i = 2; i <= a; i++) {
            if (check(i) == true && a % i == 0) {
                list.add(i);
                break;
            }
        }
        return String.valueOf(list);
    }
    public static void main(String[] args) {
        bai8(1001);
    }
}
