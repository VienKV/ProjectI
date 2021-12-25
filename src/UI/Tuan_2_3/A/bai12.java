/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UI.Tuan_2_3.A;


public class bai12 {
    public static void bai12(int a){
        for(int i=0;i<=a;i++){
            for(int j=0;j<=i;j++){
                if(j<=i)System.out.print("* " );
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        bai12(10);
    }
}
