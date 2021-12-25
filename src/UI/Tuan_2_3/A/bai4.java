/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UI.Tuan_2_3.A;

import java.util.ArrayList;
import java.util.List;


public class bai4 {
    private static boolean check(int a){
        if(a%3==0 && a%7==0)return true;
        return false;
    }
    public static String bai4(){
        List<Integer> list=new ArrayList<>();
        
        for(int i=0;i<100;i++){
            if(check(i)==true)
                list.add(i);
            
        }
        return String.valueOf(list);
    }
}
