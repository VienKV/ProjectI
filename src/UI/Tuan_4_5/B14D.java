package UI.Tuan_4_5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B14D {
    private static Scanner sc = new Scanner(System.in);

    private static List<String> lol(List<String> list, int a) {
        List<String> list2 = new ArrayList<>();
        

       
            for (int i = 0; i < list.get(0).charAt(i); i++) {
                char var = list.get(0).charAt(i);
                switch (var) {
                    case '1' -> {
                        list2.add(list.get(0).replace(list.get(0).charAt(i), '2'));
                    }
                    case '2' -> {
                        list2.add(list.get(0).replace(list.get(0).charAt(i), '3'));
                    }
                    case '3' -> {
                        list2.add(list.get(0).replace(list.get(0).charAt(i), '4'));
                    }
                    case '4' -> {
                        list2.add(list.get(0).replace(list.get(0).charAt(i), '5'));
                    }
                    case '5' -> {
                        list2.add(list.get(0).replace(list.get(0).charAt(i), '6'));
                    }
                    case '6' -> {
                        list2.add(list.get(0).replace(list.get(0).charAt(i), '7'));
                    }
                    case '7' -> {
                        list2.add(list.get(0).replace(list.get(0).charAt(i), '8'));
                    }
                    case '8' -> {
                        list2.add(list.get(0).replace(list.get(0).charAt(i), '9'));
                    }
                    case '9' -> {
                        list2.add(list.get(0).replace(list.get(0).charAt(i), '1'));
                        list2.add("0");
                    }

                }
            }

    
        return list2;
    }

    public static void main(String[] args) {
        List<String> list2 = new ArrayList<>();
        System.out.println("nhap so phan tu co trong mang:");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.println("nhap S[" + (1) + "]: ");
        String a = sc.nextLine();
        list2.add(a);
        // for(int i=0;i<number;i++){
        System.out.println(lol(list2, number));
        // }

    }
}
