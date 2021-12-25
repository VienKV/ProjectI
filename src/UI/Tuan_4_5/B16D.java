package UI.Tuan_4_5;

import java.util.Scanner;

public class B16D {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Nhap mang S1");
        String a = sc.nextLine();
        System.out.println("Nhap mang S2");
        String b = sc.nextLine();int count=0;
        for (int i = 0; i < a.length(); i++) {
            String x=String.valueOf(a.charAt(i));
            if(b.contains(x)){
                count=0;
            }else count=1;             
        }
        if(count==1)System.out.print(" false");
        else if(count ==0) System.out.print(" true");
    }
    public static String B16(String a, String b) {
        if(a.length()<b.length()){
            int count=0;
        for (int i = 0; i < a.length(); i++) {
            String x=String.valueOf(a.charAt(i));
            if(b.contains(x)){
                count=0;
            }else count=1;             
        }
        if(count==1)return " không là con";
        else if(count ==0) return " là con";
        return "không là con";
        }else{
            int count=0;
        for (int i = 0; i < b.length(); i++) {
            String x=String.valueOf(b.charAt(i));
            if(a.contains(x)){
                count=0;
            }else count=1;             
        }
        if(count==1)return " không là con";
        else if(count ==0) return " là con";
        return "không là con";
        }
    }
}
        