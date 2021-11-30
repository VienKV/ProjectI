package baitaptuan2_3;

public class BT06_A {
    public static void main(String[] args){
        int a=0,cnt=0,n,sum;
        System.out.println("\n5 so hoan hao dau tien la:");
        while(cnt<5){
            a++;
            sum=1;
            for(n=2;n<a;n++){
                if(a%n==0) sum+=n;
            }
            if(a==sum){
                System.out.print(a + " ");
                cnt++;
            }
        }
        System.out.println("\nVien Dinh Khuong 20183567");
    }
}
