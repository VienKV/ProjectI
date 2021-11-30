
package baitaptuan2_3;


public class BT03_A {
    public static boolean isPrimeNumber(int n) {
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.print("So nguyen to trong khoang 1000 den 2000 la: \n");
         for (int i = 1001; i < 2000; i += 2) {
            if (isPrimeNumber(i)) {
                System.out.print(" " + i);
            }
        }
        System.out.println("\nVien Dinh Khuong 20183567");
    };
}
