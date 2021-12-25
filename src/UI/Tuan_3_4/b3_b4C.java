package UI.Tuan_3_4;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class b3_b4C {
    private static Scanner sr=new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        Random rand =new Random();
        System.out.print("Nhap so phan tu cua mang:");
        int p=sr.nextInt();
        for(int i=0;i<p;i++){
            int x=rand.nextInt(100);
            a.add(x);
        }
        System.out.println("Cac phan tu mang: ");
        for (int i : a) {
        System.out.print("|"+i+"|");
        }
        System.out.println("");
        int min = a.get(0);
        int max = a.get(0);
        int minIndex = 0, maxIndex = 0;
        for(int i = 1; i < a.size(); i++ ){
            if( a.get(i) < min ){
                min = a.get(i);
                minIndex = i;
            }
            if( a.get(i) > max ){
                max = a.get(i);
                maxIndex = i;
            }
        }
        System.out.println("Min = " + min + ", tai vi tri: "+ (minIndex+1));
        System.out.println("Max = " + max + ", tai vi tri: "+ (maxIndex+1));    
    }
}