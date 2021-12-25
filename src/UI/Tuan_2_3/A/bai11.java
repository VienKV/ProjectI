
package UI.Tuan_2_3.A;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class bai11 {
    
    
    public static String bai11(int a){
        List<Integer> list=new ArrayList<Integer>();
        Random r= new Random();
        int []p=new int[a];
        System.out.println("Day so truoc sap xep:");
        for(int i=0;i<a;i++){
            p[i]=r.nextInt(a);
            list.add(p[i]);
        }
        
        list.sort((o1,o2)->o2-o1);
        return String.valueOf(list);     
    }
    public static void main(String[] args) {
        bai11(11);
    }
}
