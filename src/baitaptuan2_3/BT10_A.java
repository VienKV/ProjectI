package baitaptuan2_3;

public class BT10_A {
    public static void primeFactors(int n){
        int t = 2;
        if (n%2==0)
            System.out.print(2 + " ");
        while (n%2==0){
            n /= 2;
        }
 
        for (int i = 3; i <= Math.sqrt(n); i+= 2){
            while (n%i == 0){
                if(i != t){
                    System.out.print(i + " ");
                    t = i;
                }
                n /= i;
            }
        }
 
        if (n > 2)
            System.out.print(n);
    }
 
    public static void main (String[] args){
        int n = 120;
        System.out.println("Cac uoc nguyen to cua " + n + " : ");
        primeFactors(n);
        System.out.println("\nVien Dinh Khuong 20183567");
    }
}