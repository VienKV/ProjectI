/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UI.Tuan_2_3.A;

import java.util.ArrayList;
import java.util.List;


public class bai6 {
    private static boolean  check(int a){
        if(a<2) return false;
        for(int i=2;i<a-1;i++){
        if(a%i==0)return false;
    }
        return true;
    }
    private static int somu(int a,int x){
        
        if(x==0) return 1;
        else if(x==1)return a;
        else return somu(a,x-1)*a;
    }
    private static boolean  check_sohoanhao(int a){
        int count =0;
        for(int i=1;i<a;i++){
            if(a%i==0)count+=i;
        }
        if(count==a)return true;
        return false;
    }
    public static String bai6(){
        List<Integer> list=new ArrayList<>();
        int count=0;
        int j=2;
        for(int i=1;count<=5;i++){
            if(check(i)==true){
                count++;
                int a=somu(j,i-1)*(somu(j,i)-1);
                if(check_sohoanhao(a)==true)
                    list.add(a);
            }
        }
        return String.valueOf(list);
    }
    public static void main(String[] args) {
        bai6();
    }
}
