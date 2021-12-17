
package baitaptuan2_3;


public class BT07_A {
    public static void main(String[] args){
      int du0 = 0, du1 =0, du2= 0, du3 =0;
      for(int i =0; i<=100; i++){
          if(i%5 == 0) du0++;
          if(i%5 == 1) du1++;
          if(i%5 == 2) du2++;
          if(i%5 == 3) du3++;
      }
      System.out.print("Trong cac so tu nhien <=100 co "+ du0 + " chia het cho 5");
      System.out.print("\nTrong cac so tu nhien <=100 co "+ du1 + " chia cho 5 du 1");
      System.out.print("\nTrong cac so tu nhien <=100 co "+ du2 + " chia cho 5 du 2");
      System.out.print("\nTrong cac so tu nhien <=100 co "+ du3 + " chia cho 5 du 3");
      System.out.println("\nVien Dinh Khuong 20183567");
    }
}
