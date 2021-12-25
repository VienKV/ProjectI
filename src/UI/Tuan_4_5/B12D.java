package UI.Tuan_4_5;

import java.util.List;
import java.util.Scanner;

public class B12D {
    static Scanner sc = new Scanner(System.in);

    private static String laytendem(String str) {
        String[] n = str.split("\\s");
        str = "";
        for (int i = 1; i < n.length - 1; i++) {
            str += String.valueOf(n[i]);
        }
        return str;
    }

    private static String chuanhoahoten(String str) {
        String[] n = str.split("\\s");
        str = "";
        for (int i = 1; i < n.length-1; i++) {
            str +=n[i].toUpperCase();
            str.replaceAll("THI", "Thi");
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println("nhap so hoc sinh trong lop:");
        int number = sc.nextInt();
        String[] a = new String[number];
        for (int i = 0; i < a.length; i++) {
            System.out.println("nhap a[" + (i + 1) + "]: ");
            a[i] = sc.nextLine();
            a[i].trim().replaceAll("\\s+", " ");
        }
        String d;
        int count = 0;
        for (int i = 0; i < a.length; i++) {          
            if (a[i].length() != 0) {
                chuanhoahoten(a[i]);
                String b = a[i].toLowerCase();
                d=laytendem(b);           
                if (d.contains("thi"))
                    count++;
            }
        }
        System.out.println("co " + count + " ban co ten dem la Thi");
    }
    public static String B12(List<String> a) {
        
        
        String d;
        int count = 0;
        for (int i = 0; i < a.size(); i++) {          
            if (a.get(i).length() != 0) {
                chuanhoahoten(a.get(i));
                String b = a.get(i).toLowerCase();
                b.split("\\s");
                d=laytendem(b);           
                if (d.contains("thi"))
                    count++;
            }
        }
        return "Có " + count + " bạn thên đệm là Thi";
    }
}
