package UI.Tuan_4_5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B6D {
    private static  Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("nhap xau ban dau:");
        String name = sc.nextLine();
        char []a=name.toCharArray();
        System.out.println("xau sau khi doi la: ");
        for(int i=a.length-1;i>=0;i--){
            System.out.print(a[i]);
        }
    }
    public static String B6(String name) {
        List<String> list=new ArrayList<>();
        char []a=name.toCharArray();
        System.out.println("xau sau khi doi la: ");
        for(int i=a.length-1;i>=0;i--){
            
            list.add(String.valueOf(a[i]));
        }
        return list.toString();
    }
}
