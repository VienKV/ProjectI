package baitaptuan4_5;

import java.util.*;

public class BT11 {
    public static boolean checkName(String n){
        String firstName;
        String middleName;
        String lastName;
        int firstSpace = n.indexOf(" ");
        
        if(firstSpace <0){
            lastName = n;
            //System.out.println("Ban chi nhap moi ten, va do la : "+lastName);
            return lastName.equals("An");
        }else {
            firstName = n.substring(0, firstSpace);
            //System.out.println(firstName);
        
            int secondSpace = n.indexOf(" ", firstSpace + 1);
            if (secondSpace < 0) { 
                lastName = n.substring(firstSpace + 1);
//                System.out.println("Ban chi nhap ho và ten mà khong co phan ten dem,"
//                        + " ho va ten lan luot la : " + firstName+ ", " + lastName);
                return lastName.equals("An");
            }else {
                middleName = n.substring(firstSpace, secondSpace);
                lastName = n.substring(secondSpace + 1);
//                System.out.println("Ban nhap day du ho, ten, ten dem va"
//                        + " ho, ten dem, ten lan luot la : " + firstName+", "+middleName+ ", " + lastName);
                return lastName.equals("An");
            }
        }
    }
    public static void main(String[] args) {

        ArrayList<String> name = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        int cnt = 0;

        System.out.println("Nhap so hoc sinh ");

        int t = scanner.nextInt();
        String answer = scanner.nextLine();
        
        for(int i =1; i < 1+t;i++){
            System.out.println("Nhap ho ten hoc sinh thu "+ i + " : ");
            answer = scanner.nextLine();
            name.add(answer);
        }

        for (int i = 0; i < name.size(); i++) {
            String n = name.get(i);
            boolean c = checkName(n);
            System.out.println(" "+ (i+1) + ":"  + c);
            if(checkName(n))cnt ++;
        }
        System.out.println("So hoc sinh co phan ten la \"An\" : " + cnt);
        System.out.println("\nVien Dinh Khuong 20183567");
    }
}
