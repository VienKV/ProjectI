package UI.Tuan_4_5;

import java.util.List;
import java.util.Scanner;

public class B11D {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("nhap so hoc sinh trong lop:");
        int number=sc.nextInt();
        String[] a=new String[number];
        sc.nextLine();
        for (int i = 0; i < a.length; i++) {
            System.out.println("nhap a["+(i+1)+"]: ");
            a[i]=sc.nextLine(); 
            a[i].trim().replaceAll("\\s+"," ");           
        }
        
        int count=0;
        String b="";
        for (int i = 0; i < a.length; i++) {
            if(a[i].length()!=0){
                b=a[i];
                int x=b.length()-2;
                if(b.subSequence(x, b.length()).equals("An")||
                    b.subSequence(x,b.length()).equals("an")||
                        b.subSequence(x,b.length()).equals("AN"))count++;
                System.out.println(b.subSequence(b.length()-2,b.length()));
            }
        }
        System.out.println("co "+count+" ban ten An");
    }
     public static String B11(List<String> list2) {
        for (int i = 0; i < list2.size(); i++) {
            list2.get(i).trim().toLowerCase().replaceAll("\\s+", " ");

        }
        int count = 0;

        for (int i = 0; i < list2.size(); i++) {

            if (list2.get(i).length() != 0) {
                String b = list2.get(i).toLowerCase();
                int x= b.length()-3;
                if (b.subSequence(x, b.length()).equals(" an")) {
                    count++;
                }
            }
        }
        return "Có " + count + " bạn tên An";

    }
}
