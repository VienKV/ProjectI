
package baitaptuan2_3;

import java.util.Scanner;

public class BT12_A {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Scanner scanner = new Scanner(System.in);
    int hight;
    int choiceNumber;
    do {
        System.out.printf("\n\nNhap chieu cao cua tam giac: ");
        hight = sc.nextInt();
    } while ((hight < 2) || (hight > 10));
    do {
        System.out.println("Bam so de chon kieu in (1/2): ");
        choiceNumber = scanner.nextInt();
    } while ((choiceNumber < 1) || (choiceNumber > 2));
             
    switch (choiceNumber){
        case 1:
            System.out.println("Ban chon in xuoi");
            for (int i = 1; i <= hight; ++i) {
                for (int j = 1; j <= i; ++j) {
                     System.out.print("* ");
                }
                 System.out.println();
            }
            break;
        case 2:
            System.out.println("Ban chon in nguoc");
             for (int i = hight; i >= 1; --i) {
                for (int j = 1; j <= i; ++j) {
                     System.out.print("* ");
                }
                System.out.println();
            }
            break;
    }
    System.out.println("\nVien Dinh Khuong 20183567");
  }
}
