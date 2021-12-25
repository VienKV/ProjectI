/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UI.Tuan_2_3.A;

import java.util.ArrayList;
import java.util.List;


public class bai10 {

    public static String bai10(int i) {
        List<Integer> a = new ArrayList<>();
        String b = "";
        int x =i;
        
        for (int j = 2; j <= x; j++) {
            if (bai9.check(j) == true) {
                if (i % j == 0) {
                    a.add(j);                  
                    i /= j;
                }
            }
        }
        
        return String.valueOf(a);
    }

    public static void main(String[] args) {
        bai10(12);
    }
}
