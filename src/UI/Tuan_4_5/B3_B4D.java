package UI.Tuan_4_5;

import java.util.Scanner;

public class B3_B4D {
    private static  Scanner sc=new Scanner(System.in);
    public static void chuanhoahoten(String name){
        name=name.trim().toLowerCase();
        name=name.replaceAll("\\s+", " ");
    }
    public static void main(String[] args) {
        int count=0;
        System.out.println("nhập ho ten:");
        String name = sc.nextLine();
        System.out.println("");
        chuanhoahoten(name);   
        for(int i=0;i<name.length();i++){
            if(name.charAt(i)==' ')count++;
        }
        String []a;
        a=name.split("\\s");
        System.out.println("Ten:"+a[count]);
        System.out.println("Ho:"+a[0]);
    }
    public static String B3_B4(String name){
        int count=0;
        chuanhoahoten(name);   
        for(int i=0;i<name.length();i++){
            if(name.charAt(i)==' ')count++;
        }
        String []a;
        a=name.split("\\s");
        
        return "Tên: " +a[count]+"\n"+"Họ: "+a[0];
    }
}