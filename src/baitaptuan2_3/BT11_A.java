
package baitaptuan2_3;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;


public class BT11_A {
    public static void main(String args[]){
        int[] solutionArray = { 1, 2, 3, 4, 5, 6, 16, 15, 14, 13, 12, 11 };

        shuffleArray(solutionArray);
        for (int i = 0; i < solutionArray.length; i++){
            System.out.print(solutionArray[i] + " ");
        }
        System.out.println("\nVien Dinh Khuong 20183567");
        System.out.println();
    }

    static void shuffleArray(int[] ar){
        Random rnd = ThreadLocalRandom.current();
        for (int i = ar.length - 1; i > 0; i--){
            int index = rnd.nextInt(i + 1);
            int a = ar[index];
            ar[index] = ar[i];
            ar[i] = a;
        }
    }
}
