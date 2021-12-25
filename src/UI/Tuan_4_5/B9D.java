package UI.Tuan_4_5;

import java.util.Arrays;
import java.util.Scanner;

public class B9D {
    private static  Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("nhap xau S ban dau:");
        String name;
        int o,p;
        char []a;
        do{
            name = sc.nextLine();
            a=name.toCharArray();
            System.out.println("nhap chi so i ban dau:");
             o=sc.nextInt();
            System.out.println("nhap chi so j ban dau:");
             p=sc.nextInt();
        }while(o<0 ||p<0|| o>p||o>a.length|| p>a.length);
        if(a.length>=1){
        char temp=a[o-1];
        a[o-1]=a[p-1];
        a[p-1]=temp;
        }
        else System.out.println("qua it de doi");
        
        System.out.println("xau sau khi doi la: ");
        System.out.println(a);
    }
    public static String B9(int o,int p,String name) {
        char []a = null;
        a=name.toCharArray();
        if(a.length>=1){
        char temp=a[o-1];
        a[o-1]=a[p-1];
        a[p-1]=temp;
        }
        else return "Quá ít để đổi";
        
        return "Xâu sau khi đổi là : "+Arrays.toString(a);
        
    }
}

