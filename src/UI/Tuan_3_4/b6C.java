package UI.Tuan_3_4;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class b6C {
    private static Scanner sr=new Scanner(System.in);
public static void main(String[] args) {
    ArrayList<Integer> a= new ArrayList<>();
    ArrayList<Integer> b= new ArrayList<>();
    ArrayList<Integer> arrTemp= new ArrayList<>();
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
    for (int i : a) {
        System.out.print("|"+i+"|");
    }
    for(int i=0;i<a.size();i++){
        for(int j=0;j<a.size();j++){
            if(a.get(i)!=0){
                if(a.get(j)%a.get(i)==0 && a.get(j)/a.get(i)!=1 ){
                    b.add(a.get(i));
                }
            }
        }   
    }
    for (int i = 0; i < b.size(); i++) {
        if (!arrTemp.contains(b.get(i))) {
            arrTemp.add(b.get(i));
        }
    }
    arrTemp.sort((o1,o2)->o1-o2);
    System.out.println("\nso hang la uoc thuc su cua cac so hang khac trong day la:  ");
    if(b.size()==0) System.out.println(" khong co.");
    else for (int i : arrTemp) {
        System.out.print("|"+i+"|");
    }
    }
}
