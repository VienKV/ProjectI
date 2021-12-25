package UI.Tuan_3_4;

import java.util.ArrayList;
import java.util.Random;

public class b1C {
    
public static void b1(int p) {
    ArrayList<Integer> a= new ArrayList<Integer>();
    Random rand =new Random();
    System.out.print("Nhap so phan tu cua mang:");
    
    for(int i=0;i<p;i++){
        int x=rand.nextInt(100);
        a.add(x);
    }
    System.out.println("mang truoc xap xep: ");
    for (int i : a) {
        System.out.print("|"+i+"|");
    }
    System.out.println("");
    a.sort((o1,o2)->o2-o1);
    System.out.println("mang sau xap xep: ");
    for (int i : a) {
        System.out.print("|"+i+"|");
    }
}
}