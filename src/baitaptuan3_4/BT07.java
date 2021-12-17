package baitaptuan3_4;

import java.util.*;

public class BT07 {
    static class SmallestMissing{
        int findFirstMissing(int array[], int start, int end){
            if (start > end)
                return end + 1;
 
            if (start != array[start])
                return start;
 
            int mid = (start + end) / 2;
 
            if (array[mid] == mid)
                return findFirstMissing(array, mid+1, end);
 
            return findFirstMissing(array, start, mid);
        }
    }
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        SmallestMissing small = new SmallestMissing();
        //System.out.print("Nhap so phan tu cua day so: ");
        int n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Nhap cac phan tu cua day so: ");
        for(int i=0; i<n; i++){
            //System.out.printf("arr[%d] = ", i);
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("So tu nhien nho nhat khong co trong day la : "
                + small.findFirstMissing(arr, 0, n - 1));
        
        System.out.println("\nVien Dinh Khuong 20183567");
    }
}
