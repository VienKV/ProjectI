package UI.Tuan_3_4;


import java.util.Scanner;

public class b10C {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Nhap mang S");
        String s=sc.nextLine();
        int count=0,x=0;
        String a="";
        for (int i = 0; i < s.length()-1; i++) {
                 a=String.valueOf(s.charAt(i));
                
                if(a==String.valueOf(s.charAt(i+1))){
                        count++;
                        x=i;
                }else{
                        count=0;        
                }
                a=String.valueOf((s.charAt(i+1)));
        }
        System.out.print(" phan tu "+a+" co day lien nhau dai nhat tai vi tri "+ x+" chuoi dai "+count);
        
    }
}
        