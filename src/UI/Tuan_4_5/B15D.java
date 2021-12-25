package UI.Tuan_4_5;

import java.util.Scanner;

public class B15D {
    private static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Nhap mang A");
        String a=sc.nextLine(); 
        System.out.println("Nhap mang B");
        String b=sc.nextLine();
        float x=b.length()/2;
        String p="";
        for (int i = 0; i < x; i++) {
            p+=b.charAt(i);
        }
        p+=" "+a+" ";//de de nhin dc doan them vao.
        for (int i = (int)x; i < b.length(); i++) {
            p+=b.charAt(i);
        }
        System.out.println(p);
    }
     public static String B15(String a,String b) {
        
            int x=b.length()/2;
        String p="";
        for (int i = 0; i < x; i++) {
            p+=b.charAt(i);
        }
        p+=" "+a+" ";//de de nhin dc doan them vao.
        for (int i = (int)x; i < b.length(); i++) {
            p+=b.charAt(i);
        }
        return "Chuỗi được sau khi được thêm: "+p;
        
        
    }
}
