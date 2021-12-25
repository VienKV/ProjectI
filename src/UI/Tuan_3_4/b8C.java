package UI.Tuan_3_4;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class b8C {
    private static Scanner sr=new Scanner(System.in);
public static void main(String[] args) {
    ArrayList<Integer> a= new ArrayList<Integer>();
    ArrayList<Integer> b= new ArrayList<Integer>();
    Random rand =new Random();
    System.out.print("Nhap so phan tu cua mang:");
    int p=sr.nextInt();
    System.out.print("Day so cho truoc:");
    for(int i=0;i<p;i++){
        int x=rand.nextInt(3);//Tang ty le xuat hien so 0
        a.add(x);
    }
    for (int i : a) {
        System.out.print(" | "+i);
    }
    System.out.println("");
    System.out.print("\nDay so sau khi xoa 0:");
    for(int i=0;i<a.size();i++)
        if(a.get(i)!=0)b.add(a.get(i));
    for(int i : b){
        System.out.print(" | "+i);
    }
}
}
