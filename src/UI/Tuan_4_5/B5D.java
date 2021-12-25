package UI.Tuan_4_5;

import java.util.Arrays;
import java.util.Scanner;

public class B5D {
    private static  Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("nhap xau ban dau:");
        String name = sc.nextLine();
        char []a=name.toCharArray();
        for(int i=0;i<a.length;i++){
            if(a[i]=='1'){              
                a[i]='0';
            }
            else if(a[i]=='0'){
                a[i]='1';
            }
        }
        System.out.println("xau sau khi doi la: ");
        System.out.println(a);
    }
    public static String B5(String name){
        char []a=name.toCharArray();
        for(int i=0;i<a.length;i++){
            if(a[i]=='1'){              
                a[i]='0';
            }
            else if(a[i]=='0'){
                a[i]='1';
            }
        }
        System.out.println("xau sau khi doi la: ");
        System.out.println(a);
        return "Xâu sau khi đổi là : "+Arrays.toString(a).toString();
    }
    
}
