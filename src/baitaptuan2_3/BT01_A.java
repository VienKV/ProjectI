package baitaptuan2_3;


public class BT01_A {
   
    public static boolean isPrimeNumber(int n) {
        if (n <= 2) {
            return true;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.print("20 so nguyen to dau tien la: \n");
        int n = 100;
        for (int i = 1; i < n; i++) {
            if (isPrimeNumber(i)) {
                System.out.print(" " + i);
            }
        }
        System.out.println("\nVien Dinh Khuong 20183567");
    };
}
