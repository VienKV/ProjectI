package UI.Tuan_3_4;

import java.util.ArrayList;
import java.util.Scanner;

public class b13C {

    static int count = 0;

    static void topRight(int[][] matrix, int x1, int y1, int x2, int y2) {
        for(int i=x1;i<=x2;i++){
            matrix[y1][i]=count++;
        }
        for(int i=y1+1;i<=y2;i++){
            matrix[i][x2]=count++;
        }
        if(x2-x1>0 && y2-y1>0){
            y1++;
            x2--;
            botomLeft(matrix,x1,y1,x2,y2);
        }
    }
    static void botomLeft( int[][] matrix, int x1, int y1, int x2, int y2){
        for(int i=x2;i>=x1;i--){
            matrix[y2][i]=count++;
        }
        for(int i=y2-1;i>=y1;i--){
            matrix[i][x1]=count++;
        }
        if(x2-x1>0 && y2-y1>0){
            y2--;
            x1++;
            
            topRight(matrix,x1,y1,x2,y2);
        }
    }
    
    public static String init(int n){
        int[][] matrix;
        matrix = new int[n][n];
        topRight(matrix, 0, 0, n - 1, n - 1);
        count=0;
        return display(matrix);
        
    }
    static String display(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int[] x : matrix) {
            for (int i : x) {
                System.out.printf(" %5d",i);
                list.add(i);               
            }
             System.out.println("\n");
        }
        System.out.println(list);
        return String.valueOf(list);
    }
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        init(5);
    }
}
