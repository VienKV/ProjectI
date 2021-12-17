
package baitaptuan2_3;

import java.util.Scanner;

public class BT08_A {
    static int smallestDivisor(int n){
        if (n % 2 == 0)
            return 2;
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0)
                return i;
        }

        return n;
    }
    public static void main(String[] args){
        int n; 
        Scanner scanner = new Scanner(System.in);
        
        do {
            System.out.println("Nhap n: ");
            n = scanner.nextInt();
        } while (n < 1);
        System.out.println (smallestDivisor(n));
        System.out.println("\nVien Dinh Khuong 20183567");
    }
}
