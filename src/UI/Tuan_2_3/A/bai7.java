package UI.Tuan_2_3.A;

public class bai7 {

    public static void bai7() {
        int a = 0, b = 0, c = 0, d = 0;
        for (int i = 0; i < 100; i++) {
            int x = i % 5;
            switch (x) {
                case 0: {
                    a += 1;
                    break;
                }
                case 1: {
                    b += 1;
                    break;
                }
                case 2: {
                    c += 1;
                    break;
                }
                case 3: {
                    d += 1;
                    break;
                }

            }

        }
        System.out.println(a + "|" + b + "|" + c + "|" + d);
    }

    public static void main(String[] args) {
        bai7();
    }
}
