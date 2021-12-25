package UI.Tuan_2_3.A;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


public class bai9 {

    public static boolean check(int i) {
        if (i < 2) {
            return false;
        } else if (i == 2) {
            return true;
        } else if (i == 3) {
            return true;
        }
        for (int j = 4; j < i - 1; j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }

    public static String bai9(int i) {
        int x = i;
        
        System.out.print(i+" = ");
            
        for (int j = 2; j <= x;) {
            if (check(j) == true) {
                if (i % j == 0) {
                                      
                    System.out.print(j+"*");
                    i /= j;
                } else {
                    j++;
                }
            }
        }
        
        return "Chưa in ra được màn hình ";
    }

    public static void main(String[] args) {
        bai9(20);
    }
}
