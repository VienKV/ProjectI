package baitaptuan3_4;

import java.util.Scanner;

public class BT13 {
    public static Scanner scanner = new Scanner(System.in);

    public static void showMaTrix(int a[][], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " \t ");
            }
            System.out.println("");
        }
    }

    public static void createSprialMaTrix(int n,int a[][]) {
        int d = 0, i, t = 1;
        int row = n - 1, col = n - 1;
        while (t <= n * n) {
            for (i = d; i <= col; i++) {
                a[d][i] = t++; 
            }
            for (i = d + 1; i <= row; i++) {
                a[i][col] = t++; 
            }
            for (i = col - 1; i >= d && t <= n * n; i--) {
                a[row][i] = t++; 
            }
            for (i = row - 1; i > d && t <= n * n; i--) {
                a[i][d] = t++;  
            }
            d++;
            row--;
            col--;
        }
        showMaTrix(a, n);
    }

    public static void main(String[] args) {
        int n;
        do {
            System.out.println("Nhap vao kich thuoc o vuong n*n: ");
            n = scanner.nextInt();
        } while (n < 3 || n > 8);
        int a[][] = new int[n][n];
        createSprialMaTrix(n, a);
        
        System.out.println("\nVien Dinh Khuong 20183567");
    }
}
