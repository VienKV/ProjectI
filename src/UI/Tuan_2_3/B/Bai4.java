/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UI.Tuan_2_3.B;

public class Bai4 {
    private static int Fi(int a){
        if(a==1)return 1;
        else if (a==2) return 2;
        else return Fi(a-1)+Fi(a-2);
    }
    public static String bai4(int a){
        return String.valueOf(Fi(a));
    }
}
