package baitaptuan4_5;

import java.util.*;

public class BT10 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int lenghtMax = 0;
        Deque<Integer> index = new LinkedList<>();
        
        System.out.println("Nhap vao so phan tu cua mang:");
        int n = scanner.nextInt();
        System.out.println("Nhap vao mang xau ki tu: ");
        String arr[] = new String[n];
        for(int i = 0; i < n; i++){
            //System.out.print("Nhap vao phan tu thu " + (i + 1) + " :");
            arr[i] = scanner.next();
        }
        
        for(int i = 0; i < n; i++){
            int lengthCurrent = arr[i].length();
            if(lenghtMax <= lengthCurrent) {
                lenghtMax = lengthCurrent;
                index.add(i);
            }
        }
        System.out.println("Xau co do dai lon nhat la :");
        System.out.println(arr[index.getLast()]);
        System.out.println("\nVien Dinh Khuong 20183567");
    }
}
