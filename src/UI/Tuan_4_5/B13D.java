package UI.Tuan_4_5;

import java.util.List;
import java.util.Scanner;

public class B13D {
    static Scanner sc = new Scanner(System.in);
    private static String chuanhoa(String str) {
        String[] n = str.split("\\s");
        str = "";       
        str += String.valueOf(n[n.length-1].charAt(0)); 
        return str;
    }
    public static void main(String[] args) {
        System.out.println("nhap so hoc sinh trong lop:");
        int number = sc.nextInt();
        String[] a = new String[number];
        for (int i = 0; i < a.length; i++) {
            System.out.println("nhap a[" + (i + 1) + "]: ");
            a[i] = sc.nextLine();
            a[i].trim().replaceAll("\\s+", " ").toLowerCase();
        }
        String d;
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i].length() != 0) {
                String b = a[i];
                d = chuanhoa(b);
                if (d.equals("H")||
                    d.equals("h"))
                    count++;
            }
        }
        System.out.println("co " + count + " ban co ten bat dau bang chu H.");
    }
    public static String B13(List<String> list2) {
        
        String d;
        int count = 0;
        for (int i = 0; i < list2.size(); i++) {
            if (list2.get(i).length() != 0) {
                String b = list2.get(i);
                d = chuanhoa(b);
                if (d.equals("H")||
                    d.equals("h"))
                    count++;
            }
        }
        return "co " + count + " ban co ten bat dau bang chu H.";
    }
    
}
