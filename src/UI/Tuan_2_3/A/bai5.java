/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UI.Tuan_2_3.A;

import java.util.ArrayList;
import java.util.List;


public class bai5 {
    private static boolean check(int a){
        if(a%3==0 && a%7==0 && a%5==0)return true;
        return false;
    }
    public static String bai5(){
        List<Integer> list=new ArrayList<>();
        for(int i=1000;i<2000;i++){
            if(check(i)==true)
                list.add(i);
        }
        return String.valueOf(list);
    }
}
