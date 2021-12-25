package UI.Tuan_4_5;

import java.util.Scanner;

public class B2D {

    private static  Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        String a= sc.nextLine();
        int count=0;
        String b="abc";
        if( a.contains(b)==true){
            for(int i=0;i<a.length()-2;i++){
                if(a.charAt(i)=='a'&& a.charAt(i+1)=='b'&&a.charAt(i+2)=='c'){
                    count++;
                }
            }
            System.out.println("so lan xuat hien xau con 'abc': "+count);
        }
        else System.out.println("chuoi khong co chuoi con abc");
    }
}
