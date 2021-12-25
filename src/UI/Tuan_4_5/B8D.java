package UI.Tuan_4_5;

import java.util.Scanner;

public class B8D {
    private static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("nhap s1<s2");
        System.out.println("nhap s1:");
        String s1=sc.nextLine();
        System.out.println("nhap s2:");
        String s2=sc.nextLine();
        boolean a=s2.contains(s1);
        int count=0;
        if(a){
            for (int i = 0; i < s2.length()-s1.length()+1; i++) {
                int x=s1.length()+i;
                if(s2.subSequence(i,x ).equals(s1)){
                    count++;
                }
            }
            System.out.println("S1 xuất hiện "+count+" lần tại s2.");
        }
        else System.out.println("S1 không xuất hiện tại s2.");
    }
    public static String B8(String s1,String s2) {
        if(s1.length()<s2.length()){
        boolean a=s2.contains(s1);
        int count=0;
        if(a){
            for (int i = 0; i < s2.length()-s1.length()+1; i++) {
                int x=s1.length()+i;
                if(s2.subSequence(i,x ).equals(s1)){
                    count++;
                }
            }
            return "S1 xuat hien "+count+" lan tai s2.";
        }
        else return "S1 khong xuat hien tai s2.";
        }else
        {
            boolean a=s1.contains(s2);
        int count=0;
        if(a){
            for (int i = 0; i < s1.length()-s2.length()+1; i++) {
                int x=s2.length()+i;
                if(s1.subSequence(i,x ).equals(s2)){
                    count++;
                }
            }
            return "S2 xuat hien "+count+" lan tai s1.";
        }
        else return "S2 khong xuat hien tai s1.";
        }
    }
}
