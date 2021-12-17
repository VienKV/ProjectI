/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitaptuan2_3;


public class BT02_A {
    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return true;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.print("20 so nguyen to dau tien la: \n");
        int count = 0;
        int i = 2;
        do{
            if(i == 2){
                count ++;
                System.out.print(" " + i);
                i = 3;
            }
            if (isPrimeNumber(i)) {
                count ++;
                System.out.print(" " + i);
            }
            i +=2;
        }while(count < 20);
        System.out.println("\nVien Dinh Khuong 20183567");
    };
}
