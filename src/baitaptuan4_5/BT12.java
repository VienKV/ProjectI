package baitaptuan4_5;

import java.util.*;

public class BT12 {
    public static boolean checkName(String n){
        // Bài toán đi tìm middle name là Thi, và được quy ước như sau:
        // Trường hợp trong tên chỉ có 1 chữ coi như đó là last name. 
        //      Ví dụ: Thi, thì coi Thi là last name
        // Trường hợp trong tên chỉ có 2 chữ coi chữ đầu là first name, chữ thứ 2 là last name. 
        //      Ví dụ: Pham Thi, thì coi Pham là first name - Hoa là last name
        // Trường hợp trong tên chỉ có 3 chữ  trở lên coi chữ đầu là first name, chữ thứ 2 là last name, còn lại là last name.
        //      Ví dụ: Pham Thi Thi Thao, thì coi Pham là first name - Thi là middle name - Thi Thao là last name, 
        //             và trong TH này thỏa mãn yêu cầu tìm kếm
        
        String firstName;
        String middleName;
        String lastName;
        int firstSpace = n.indexOf(" ");
        
        if(firstSpace <0)return false;
        
        firstName = n.substring(0, firstSpace);
        //System.out.println(firstName);
        
        int secondSpace = n.indexOf(" ", firstSpace + 1);
        if (secondSpace < 0) { 
            lastName = n.substring(firstSpace + 1);
            //System.out.println(lastName + ", " + firstName);
            return false;
        }else {
            middleName = n.substring(firstSpace, secondSpace);
            lastName = n.substring(secondSpace + 1);
            if(" Thi".equals(middleName)){
                //System.out.println(lastName + ", " + firstName + " - " +     middleName + ".");
                return true;
            }else return false;
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
            System.out.println(" " +(i+1)+" : "+ c);
            if(checkName(n))cnt ++;
        }
        System.out.println("So hoc sinh co ten dem la \"Thi\" là: " + cnt);
        System.out.println("\nVien Dinh Khuong 20183567");
    }
}

