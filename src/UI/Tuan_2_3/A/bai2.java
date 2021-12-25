/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UI.Tuan_2_3.A;

import java.util.ArrayList;
import java.util.List;


public class bai2 {
    private static boolean check(int a){
        if(a<2) return false;
        for(int i=2;i<a-1;i++){
            if(a%i==0)return false;
        }
        return true;
    }
    
    public static String bai2(){
        List<Integer> list=new ArrayList<>();
        
        int count = 0;
        int i;
        for(i=2;count<20;i++){
            if(check(i)==true){
                list.add(i);
                count ++;
            }
                
        }
        return String.valueOf(list);
    }
    public static void main(String[] args) {
        System.out.println(bai2());
    }
}
