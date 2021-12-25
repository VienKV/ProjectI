package UI.Tuan_3_4;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class b7C {
    private static Scanner sr=new Scanner(System.in);
public static void main(String[] args) {
    ArrayList<Integer> a= new ArrayList<Integer>();
    ArrayList<Integer> b= new ArrayList<Integer>();
    Random rand =new Random();
    System.out.print("Nhap so phan tu cua mang:");
    int p=sr.nextInt();
    System.out.print("\nKhoang random:");
    int q=sr.nextInt();
    System.out.print("Day so cho truoc:");
    for(int i=0;i<p;i++){
        int x=rand.nextInt(q);
        a.add(x);
    }
    System.out.println("");
    for (int i : a) {
        System.out.print("|"+i+"|");
    }
    a.sort((o1,o2)->o1-o2);
    for(int i=0;i<a.size();i++){
        b.addAll(a);
        b.remove(b.get(i));
        boolean resultCheck = b.contains(a.get(i));
        b.clear();
        if (resultCheck == true) System.out.print("\nkhong co so nao");
        else System.out.print("\nso hang be nhat va khong bi trung trong day so: "+a.get(i));break;
    }
    }
}
