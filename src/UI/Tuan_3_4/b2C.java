package UI.Tuan_3_4;
import java.util.ArrayList;
import java.util.Scanner;

public class b2C {
    public static boolean Snt(int a) {
        if(a<2)return false;
        for(int i=2;i<a-1;i++){
            if(a%i==0)return false;
        }
        return true;
    }
    private static Scanner sr=new Scanner(System.in);
public static void main(String[] args) {
    ArrayList<Integer> a= new ArrayList<Integer>();
    System.out.print("Nhap so dau cua day so:");
    int p=sr.nextInt();
    System.out.print("Nhap so cuoi cua day so:");
    int q=sr.nextInt();
    for(int i=p;i<q;i++){
        if(Snt(i)==true){
            a.add(i);
        }
    }
    System.out.println("");
    System.out.println("so nguyen to cua day so tu nhien tu "+p+" den "+q+": ");
    for (int i : a) {
        System.out.print("|"+i+"|");
    }
    a.get(0);
    }
}