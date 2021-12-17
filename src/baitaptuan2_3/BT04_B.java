
package baitaptuan2_3;

import java.util.Scanner;

public class BT04_B {
    public static int fibonaciN(int n){
        if(n == 1 || n == 2) return 1;
        int i =3,a=0,a1 =1,a2 =1;
        while(i<=n){
            a = a1+a2;
            a1 =a2;
            a2 =a;
            i++;
        }
        return a;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n;
        
        do{
            //System.out.print("Nhap n = ");
            n = sc.nextInt();
        }while(n <= 0);
         
        System.out.println("\nSo fibonaci thu " + n +" la : " +fibonaciN(n));
        System.out.println("\nVien Dinh Khuong 20183567");
    }
}
