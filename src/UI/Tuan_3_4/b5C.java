package UI.Tuan_3_4;


import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class b5C {
    public static boolean snt(int a) {
        if(a<2)return false;
        for(int i=2;i<a-1;i++){
            if(a%i==0)return false;
        }
        return true;
    }
    private static Scanner sr=new Scanner(System.in);
public static void main(String[] args) {
    ArrayList<Integer> a= new ArrayList<Integer>();
    Random rand =new Random();
    System.out.print("Nhap so phan tu cua mang:");
    int p=sr.nextInt();
    System.out.println("");
    System.out.print("Khoang random:");
    int q=sr.nextInt();
    for(int i=0;i<p;i++){
        int x=rand.nextInt(q);
        a.add(x);
    }
    int shs=0; int snt=0;
    for (int i = 0; i < a.size(); i++) {
        if(snt(a.get(i))==true)snt++;
        else shs++;
    }
    for (int i : a) {
        System.out.print("|"+i+"|");
    }
    System.out.println("");
    System.out.println("so nguyen to co trong mang la: "+snt);
    System.out.println("so hop so co trong mang la: "+shs);
    }
}
