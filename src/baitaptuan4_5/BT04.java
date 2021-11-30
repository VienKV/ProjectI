package baitaptuan4_5;

import java.util.Scanner;

public class BT04 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Nhap vao ho va ten: ");
        String str = scanner.nextLine();

        String firstName;
        String middleName;
        String lastName;
        
        int firstSpace = str.indexOf(" ");
        
        if(firstSpace <0){
            lastName = str;
            System.out.println("Ban nhap chi moi ten nen khong co phan ho");
        }else{
            firstName = str.substring(0, firstSpace);
            int secondSpace = str.indexOf(" ", firstSpace + 1);
            
            if (secondSpace < 0) { 
                lastName = str.substring(firstSpace + 1);
                System.out.println("Ban nhap khong co ten dem va phan ho la : "+firstName);
            }else {
                middleName = str.substring(firstSpace, secondSpace);
                lastName = str.substring(secondSpace + 1);
                System.out.println("Ban nhap day du ca ho, ten dem, ten và phan ho la : "+firstName);
            }
        }
        System.out.println("\nVien Dinh Khuong 20183567");
    }
}
