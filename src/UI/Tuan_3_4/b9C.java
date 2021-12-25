package UI.Tuan_3_4;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class b9C {
    private static Scanner sr=new Scanner(System.in);
public static void main(String[] args) {
    ArrayList<Integer> a= new ArrayList<Integer>();
    Random rand =new Random();
    System.out.print("Nhap so phan tu cua mang:");
    int p=sr.nextInt();
    System.out.print("Khoang random:");
    int q=sr.nextInt();
    System.out.print("Nhap c:");
    int o=sr.nextInt();
    System.out.print("Day so cho truoc:");
    for(int i=0;i<p;i++){
        int x=rand.nextInt(q);
        a.add(x);
    }
    for (int i : a) {
        System.out.print(" | "+i);
    }
    System.out.println("");
    System.out.print("");
    int f=0,g=0,h=0;
    for(int i=0;i<a.size();i++){
        if(a.get(i)==p)f++;
        else if(a.get(i)>p)g++;
        else h++;
    }
    System.out.println("\n= c:"+f+"  || >c: "+g+"  || <c: "+h);
}
}
