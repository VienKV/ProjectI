/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI.main;

import UI.Tuan_2_3.A.*;
import UI.Tuan_3_4.b13C;
import UI.Tuan_4_5.*;
import UI.Tuan_2_3.B.Bai1;
import UI.Tuan_2_3.B.Bai2;
import UI.Tuan_2_3.B.Bai3;
import UI.Tuan_2_3.B.Bai4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static UI.Tuan_3_4.b2C.Snt;

public class main extends javax.swing.JFrame {

    /**
     * Creates new form main
     */
    public main() {
        initComponents();

    }

    public void show1() {
        int index = box1.getSelectedIndex();
        if (index > 0) {
            String a = box1.getItemAt(index);
            

            switch (a) {
                case "Bài 1" -> {
                    txt2.setText("In ra màn hình tên tất cả các hợp số");
                    txt1.setText("Không cần nhập");
                   out.setText(bai1.bai_1());
                }
                case "Bài 2" -> {
                    txt2.setText("In ra màn hình 20 số nguyên tố đầu tiên");
                    out.setText(bai2.bai2());
                    txt1.setText("Không cần nhập");
                }
                case "Bài 3" -> {
                    txt2.setText("In ra màn hình tất cả các số nguyên tố từ 1000 đến 2000");
                    out.setText(bai3.bai3());
                }
                case "Bài 4" -> {
                    txt2.setText("In ra màn hình các số <100 chia hết cho cả 3 và 7");
                    out.setText(bai4.bai4());
                }
                case "Bài 5" -> {
                    txt2.setText("In ra màn hình các số từ 1000 đến 2000 chia hết cho cả 3, 5 và 7");
                    out.setText(bai5.bai5());
                }
                case "Bài 6" -> {
                    txt2.setText("In ra màn hình 5 số hoàn hảo đầu tiên");
                    out.setText(bai6.bai6());
                }
                case "Bài 7" -> {
                    txt2.setText("Trong các số tự nhiên <100 có bao nhiêu số:\n"
                            + "\na. Chia hết cho 5.\n "
                            + "\nb. Chia cho 5 dư 1.\n"
                            + "\nc. Chia cho 5 dư 2.\n"
                            + "\nd. chia cho 5 dư 3.");
                    int x = 0, y = 0, z = 0, t = 0;
                    for (int i = 0; i < 100; i++) {
                        int q = i % 5;
                        switch (q) {
                            case 0 -> {
                                x += 1;
                            }
                            case 1 -> {
                                y += 1;
                            }
                            case 2 -> {
                                z += 1;
                            }
                            case 3 -> {
                                t += 1;
                            }

                        }

                    }
                    out.setText("Chia hết: " + String.valueOf(x)
                            + " \n Dư 1: " + String.valueOf(y)
                            + "  \nDư 2: " + String.valueOf(z)
                            + "  \nDư 3: " + String.valueOf(t));
                }
                case "Bài 8" -> {
                    txt2.setText("Cho số tự nhiên N bất kì( đã gán trước đó)\n"
                            + "\ntìm và in ra số nguyên tố nhỏ nhất của N.");
                    int i = Integer.parseInt(in1.getText());
                    out.setText(bai8.bai8(i));
                }
                case "Bài 9" -> {
                    txt2.setText("Cho số tự nhiên N bất kì( đã gán trước đó)\n"
                            + "In ra màn hình tích các số nguyên tố từ \n"
                            + " nhỏ đến lớn");
                    int i = Integer.parseInt(in1.getText());
                    out.setText(bai9.bai9(i));
                }
                case "Bài 10" -> {
                    txt2.setText("In ra màn hình tất cả các ước nguyên tố của N");
                    int i = Integer.parseInt(in1.getText());
                    out.setText(bai10.bai10(i));

                }
                case "Bài 11" -> {
                    txt2.setText("Viết chương trình đổi vị trí một dãy số cho trước");
                    int b = Integer.parseInt(in1.getText());
                    List<Integer> list = new ArrayList<Integer>();
                    Random r = new Random();
                    int[] p = new int[b];
                    for (int i = 0; i < b; i++) {
                        p[i] = r.nextInt(b);
                        list.add(p[i]);
                    }
                    out2.setText(String.valueOf(list));
                    list.sort((o1, o2) -> o2 - o1);
                    out.setText(String.valueOf(list));

                }
                case "Bài 12" -> {
                    txt2.setText("Vẽ tam giác *\n"
                            + "                     **\n"
                            + "                     ***\n"
                            + "                     ****\n"
                            + "                     *****");
                    out.setText("Chưa thêm vào được");
                }
                case "Bài 13" -> {
                    out2.setText("");
                    txt2.setText("Tính\n"
                            + "S=1+1/(1+2) +1/(1+2+3) + ...+1/(1+2+3+..+N)");
                    int i = Integer.parseInt(in1.getText());
                    Bai1.bai1(i);
                    out.setText(Bai1.bai1(i));
                }
                case "Bài 14" -> {
                    out2.setText("");
                    txt2.setText("Tính\n"
                            + "S=1/1!+1/2!+...+1/N!");
                    int i = Integer.parseInt(in1.getText());
                    out.setText(Bai2.bai2(i));
                }
                case "Bài 15" -> {
                    out2.setText("");
                    txt2.setText("Tính\n"
                            + "S=1+1/(1+2!)+...+1/(1+2!+....)");
                    int i = Integer.parseInt(in1.getText());
                    out.setText(Bai3.bai3(i));
                }
                case "Bài 16" -> {
                    out2.setText("");
                    txt2.setText("Tính số Fibonaci thứ N");
                    int i = Integer.parseInt(in1.getText());
                    out.setText(Bai4.bai4(i));
                }

            }
        }
    }

    public void show2() {
        int index = box2.getSelectedIndex();
        if (index > 0) {
            String a = box1.getItemAt(index);
            
            ArrayList<Integer> list = new ArrayList<>();
            int p = Integer.parseInt(in1.getText());
            Random rand = new Random();
            switch (a) {
                case "Bài 1" -> {
                    txt2.setText("Sắp xếp dãy số tự nhiên cho trước");
                    for (int i = 0; i < p; i++) {
                        int x = rand.nextInt(100);
                        list.add(x);
                    }
                    out2.setText(String.valueOf(list));
                    list.sort((o1, o2) -> o2 - o1);
                    out.setText(String.valueOf(list));
                }
                case "Bài 2" -> {
                    txt2.setText("Tìm số nguyên tố trong dãy số cho trước");
                    
                    int q = Integer.parseInt(in2.getText());
                    List<Integer>list2=new ArrayList<>();
                    for (int i = p; i < q; i++) {
                        list.add(i);
                        if (Snt(i) == true) {
                            list2.add(i);
                        }
                        out.setText(String.valueOf(list2));
                        list.sort((o1, o2) -> o1 - o2);
                        out2.setText(String.valueOf(list));

                    }
                }
                case "Bài 3" -> {
                    txt2.setText("In ra thông tin của số bé nhất trong dãy số cho trước");
                    for (int i = 0; i < p; i++) {
                        int x = rand.nextInt(100);
                        list.add(x);
                    }
                    out2.setText(String.valueOf(list));
                    int min = list.get(0);
                    int max = list.get(0);
                    int minIndex = 0, maxIndex = 0;
                    for (int i = 1; i < list.size(); i++) {
                        if (list.get(i) < min) {
                            min = list.get(i);
                            minIndex = i;
                        }
                        if (list.get(i) > max) {
                            max = list.get(i);
                            maxIndex = i;
                        }
                    }
                    out.setText("Min = " + min + ", tai vi tri: " + (minIndex + 1) + "\n"
                            + "Max = " + max + ", tai vi tri: " + (maxIndex + 1));

                }
                case "Bài 4" -> {
                    txt2.setText("In ra số lớn nhất và thông tin của nó từ dãy số cho trước");
                    for (int i = 0; i < p; i++) {
                        int x = rand.nextInt(100);
                        list.add(x);
                    }
                    out2.setText(String.valueOf(list));
                    int min = list.get(0);
                    int max = list.get(0);
                    int minIndex = 0, maxIndex = 0;
                    for (int i = 1; i < list.size(); i++) {
                        if (list.get(i) < min) {
                            min = list.get(i);
                            minIndex = i;
                        }
                        if (list.get(i) > max) {
                            max = list.get(i);
                            maxIndex = i;
                        }
                    }
                    out.setText("Min = " + min + ", tai vi tri: " + (minIndex + 1) + "\n"
                            + "Max = " + max + ", tai vi tri: " + (maxIndex + 1));

                }

                case "Bài 5" -> {
                    txt2.setText("Đếm số nguyên tố và hợp số từ dãy số cho trước ");
                    int q = Integer.parseInt(in2.getText());
                    for (int i = 0; i < p; i++) {
                        int x = rand.nextInt(q);
                        list.add(x);
                    }
                    out2.setText(String.valueOf(list));

                    int shs = 0;
                    int snt = 0;
                    for (int i = 0; i < list.size(); i++) {
                        if (Snt(list.get(i)) == true) {
                            snt++;
                        } else {
                            shs++;
                        }
                    }
                    out.setText("so nguyen to co trong mang la: " + snt + "\n"
                            + "so hop so co trong mang la: " + shs);
                }
                case "Bài 6" -> {
                    txt2.setText("Cho một dãy số tự nhiên, in tất cả các số hạng trong dãy số thỏa mãn\n"
                            + "số này là ước thực sự của một trong các số hạng trên");
                    int q = Integer.parseInt(in2.getText());
                    ArrayList<Integer> arrTemp = new ArrayList<>();
                    ArrayList<Integer> b = new ArrayList<>();
                    for (int i = 0; i < p; i++) {
                        int x = rand.nextInt(q);
                        list.add(x);
                    }
                    out2.setText(String.valueOf(list));
                    for (int i = 0; i < list.size(); i++) {
                        for (int j = 0; j < list.size(); j++) {
                            if (list.get(i) != 0) {
                                if (list.get(j) % list.get(i) == 0 && list.get(j) / list.get(i) != 1) {
                                    b.add(list.get(i));
                                }
                            }
                        }
                    }
                    for (int i = 0; i < b.size(); i++) {
                        if (!arrTemp.contains(b.get(i))) {
                            arrTemp.add(b.get(i));
                        }
                    }
                    arrTemp.sort((o1, o2) -> o1 - o2);
                    if (b.size() == 0) {
                        out.setText("khong co.");
                    } else {
                        out.setText(String.valueOf(arrTemp));
                    }
                }
                case "Bài 7" -> {
                    txt2.setText("In ra số tự nhiên c nhỏ nhất và không bị trùng trong dãy số cho trước");
                    ArrayList<Integer> b = new ArrayList<>();
                    int q = Integer.parseInt(in2.getText());
                    for (int i = 0; i < p; i++) {
                        int x = rand.nextInt(q);
                        list.add(x);
                    }
                    out2.setText(String.valueOf(list));
                    list.sort((o1, o2) -> o1 - o2);
                    for (int i = 0; i < list.size(); i++) {
                        b.addAll(list);
                        b.remove(b.get(i));
                        boolean resultCheck = b.contains(list.get(i));
                        b.clear();
                        if (resultCheck == true) {
                            out.setText("khong co so nao");
                        } else {
                            out.setText("\nso hang be nhat va khong bi trung trong day so: " + String.valueOf(list.get(i)));
                        }
                        break;
                    }
                }
                case "Bài 8" -> {
                    txt2.setText("In ra dãy số sau khi xóa số 0 từ dãy số cho trước ");
                    int q = Integer.parseInt(in2.getText());
                    
                    for (int i = 0; i < p; i++) {
                        int x = rand.nextInt(q);
                        list.add(x);
                    }
                    out2.setText(String.valueOf(list));
                    for(int i=0;i<list.size();++i){
                        if(list.get(i)==0){
                            list.remove(i);
                            i=-1;
                        }
                    }
                    out.setText("Day so sau khi xoa 0:  " + String.valueOf(list));
                    
                }
                case "Bài 9" -> {
                    txt2.setText("Cho số c. Đến số >c,<c, =c");
                    int q = Integer.parseInt(in2.getText());
                    for (int i = 0; i < p; i++) {
                        int x = rand.nextInt(q);
                        list.add(x);
                    }
                    out2.setText(String.valueOf(list));
                    int f = 0, g = 0, h = 0;
                    for (int i = 0; i < list.size(); i++) {
                        if (list.get(i) == p) {
                            f++;
                        } else if (list.get(i) > p) {
                            g++;
                        } else {
                            h++;
                        }
                    }
                    out.setText("\n= c:" + f + "  || >c: " + g + "  || <c: " + h);
                }
                case "Bài 10" -> {
                    txt2.setText("");
                    out2.setText("");
                    txt1.setText("c= input 1");
                    out.setText("Chưa làm được bài 10");
                }
                case "Bài 11" -> {
                    txt2.setText("");
                    out2.setText("");
                    out.setText("Chưa làm được bài 11");
                }
                case "Bài 12" -> {
                    txt2.setText("");
                    out2.setText("");
                    out.setText("Chưa làm được bài 12");
                }
                case "Bài 13" -> {
                    txt2.setText("Ma trận xoắn ốc");
                    int i = Integer.parseInt(in1.getText());

                    out.setText(b13C.init(i));
                }

            }
        }
    }

    public void show3() {
        int index = box3.getSelectedIndex();
        if (index > 0) {
            String a = box1.getItemAt(index);
            

            switch (a) {
                case "Bài 1" -> {
                    txt2.setText("Format lại tên ");
                    String name = in1.getText();
                    name = name.trim().toUpperCase();
                    name = name.replaceAll("\\s+", " ");
                    out.setText(name);
                }
                case "Bài 2" -> {
                    txt2.setText("Đếm số lần xuất hiện xâu con 'abc'");
                    String b = "abc";
                    String aa = in1.getText();
                    int count = 0;
                    if (aa.contains(b) == true) {
                        for (int i = 0; i < aa.length() - 2; i++) {
                            if (aa.charAt(i) == 'a' && aa.charAt(i + 1) == 'b' && aa.charAt(i + 2) == 'c') {
                                count++;

                            }
                        }
                        out.setText("so lan xuat hien xau con 'abc': " + count
                        );

                    } else {
                        out.setText("chuoi khong co chuoi con abc");
                        System.out.println("chuoi khong co chuoi con abc");
                    }
                }
                case "Bài 3" -> {
                    txt2.setText("Tách tên từ họ và tên đầy đủ");
                    String name = in1.getText();
                    String e;
                    e = B3_B4D.B3_B4(name);
                    out.setText(e);
                }
                case "Bài 4" -> {
                    txt2.setText("Tách Họ từ tên đầy đủ");
                    String name = in1.getText();
                    String e;
                    e = B3_B4D.B3_B4(name);
                    out.setText(e);
                }
                case "Bài 5" -> {
                    txt2.setText("Cho xâu ký tự gồm chỉ 0 và 1 \n"
                            + "đổi 0=1 và 1=0");
                    String e = in1.getText();
                    out2.setText(e);
                    out.setText(B5D.B5(e));
                }
                case "Bài 6" -> {
                    txt2.setText("In ngược lại xâu");
                    String e = in1.getText();
                    out2.setText(e);
                    out.setText(B6D.B6(e));
                }
                case "Bài 7" -> {
                    txt2.setText("Từ xâu cho trước đổi số thành $");
                    String e = in1.getText();
                    out2.setText(e);
                    out.setText(B7D.B7(e));

                }
                case "Bài 8" -> {
                    txt2.setText("Cho 2 xâu ký tự S1 và S2, Đếm xem xâu S1 xuất hiện bao nhiêu lần ở S2");
                    txt1.setText("   ＼(((￣(￣(￣▽￣)￣)￣)))／");
                    String s1 = in1.getText();
                    String s2 = in2.getText();
                    out2.setText("S1: " + s1 + "\n" + "S2: " + s2);
                    out.setText(B8D.B8(s1, s2));
                }
                case "Bài 9" -> {
                    txt2.setText("Đổi chỗ vị trí từ i sang j từ xâu ban đầu");
                    txt1.setText("Input 1 <Input 2 <30. Chỉ nhập số ");

                    int o = Integer.parseInt(in1.getText());

                    int p = Integer.parseInt(in2.getText());

                    out2.setText("I: " + o + "\n" + "J: " + p + "\n Xâu ban đầu : 12345678901234567890123456789"
                            + "Gồm khoảng 30 phần tử");
                    out.setText(B9D.B9(o, p, "12345678901234567890123456789"));
                }
                case "Bài 10" -> {
                    txt2.setText("Xâu có độ dài lớn nhất");
                    out2.setText("Số phần tử mảng: " + list2.size() + "\n"
                            + "Giá trị các phần tử" + list2);

                    String b = list2.get(0);
                    int max = list2.get(0).length();
                    int x = 1;
                    for (int i = 1; i < list2.size(); i++) {
                        if (list2.get(i).length() > max) {
                            max = list2.get(i).length();
                            b = list2.get(i);
                            x = i + 1;
                        }
                    }

                    out.setText("Phan tu " + x + " : [" + b + "] co do dai " + max + " la lon nhat trong xau a");
                }
                case "Bài 11" -> {
                    txt2.setText("Đếm bạn tên An từ danh sách nhập trước");
                    out2.setText("Số phần tử mảng: " + list2.size() + "\n"
                            + "Giá trị các phần tử" + list2);
                    out.setText(B11D.B11(list2));
                }
                case "Bài 12" -> {
                    txt2.setText("In ra có bao nhiêu bạn có tên đệm là thị");
                    out2.setText("Số phần tử mảng: " + list2.size() + "\n"
                            + "Giá trị các phần tử" + list2);
                    out.setText(B12D.B12(list2));
                }
                case "Bài 13" -> {
                    txt2.setText("in ra có bao nhiêu bạn có tên bắt đầu bằng H");
                    out2.setText("Số phần tử mảng: " + list2.size() + "\n"
                            + "Giá trị các phần tử" + list2);
                    out.setText(B13D.B13(list2));
                }
                case "Bài 14" -> {
                    txt2.setText("😒😒😒😒😒😒😒😒");
                    out.setText("Chưa ra :(");
                }
                case "Bài 15" -> {
                    txt2.setText("Chèn xâu S1 vào giữa S2");
                    String x = in1.getText();
                    String y = in2.getText();
                    out2.setText("Chuỗi A: " + x + "\n" + "Chuỗi B: " + y);
                    out.setText(B15D.B15(x, y));
                }
                case "Bài 16" -> {
                    txt2.setText("Kiểm tra S1 có phải là con của S2 hay không");
                    String x = in1.getText();
                    String y = in2.getText();
                    out2.setText("Chuỗi A: " + x + "\n" + "Chuỗi B: " + y);
                    if(x.length()<y.length()){
                        out.setText("Chuỗi A " + B16D.B16(x, y) + " chuỗi B");
                    }else
                    
                    out.setText("Chuỗi B " + B16D.B16(x, y) + " chuỗi A");
                }

            }
        }
    }
    ArrayList<String> list2 = new ArrayList<>();

    public void add() {
        list2.add(in2.getText());
        in2.setText("");
        in1.setText("");
        out2.setText("Số phần tử mảng: " + list2.size() + "\n"
                + "Giá trị các phần tử" + list2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        box1 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        box2 = new javax.swing.JComboBox<>();
        ok = new javax.swing.JButton();
        box3 = new javax.swing.JComboBox<>();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane3 = new javax.swing.JScrollPane();
        txt2 = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        in1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        in2 = new javax.swing.JTextField();
        txt1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        out2 = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        out = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jDesktopPane1.setEnabled(false);

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Tuần 2-3");

        box1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        box1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".......", "Bài 1", "Bài 2", "Bài 3", "Bài 4", "Bài 5", "Bài 6", "Bài 7", "Bài 8", "Bài 9", "Bài 10", "Bài 11", "Bài 12", "Bài 13", "Bài 14", "Bài 15", "Bài 16" }));
        box1.setToolTipText("");
        box1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box1ActionPerformed(evt);
            }
        });

        jButton2.setText("OK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setText("Tuần 3-4");

        jLabel6.setText("Tuần 4-5");

        box2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        box2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".......", "Bài 1", "Bài 2", "Bài 3", "Bài 4", "Bài 5", "Bài 6", "Bài 7", "Bài 8", "Bài 9", "Bài 10", "Bài 11", "Bài 12", "Bài 13", " " }));
        box2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box2ActionPerformed(evt);
            }
        });

        ok.setText("OK");
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });

        box3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        box3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".......", "Bài 1", "Bài 2", "Bài 3", "Bài 4", "Bài 5", "Bài 6", "Bài 7", "Bài 8", "Bài 9", "Bài 10", "Bài 11", "Bài 12", "Bài 13", "Bài 14", "Bài 15", "Bài 16" }));
        box3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(box1, 0, 232, Short.MAX_VALUE)
                    .addComponent(box2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(box3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 411, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ok, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1))
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(36, 36, 36))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel4, jLabel5, jLabel6});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButton2, ok});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(90, 90, 90)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(ok, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(box1, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(box2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(box3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel4, jLabel5, jLabel6});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {box1, box2, box3});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton1, jButton2, ok});

        txt2.setEditable(false);
        txt2.setBackground(new java.awt.Color(204, 255, 204));
        txt2.setColumns(15);
        txt2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txt2.setRows(5);
        txt2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane3.setViewportView(txt2);

        in1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                in1ActionPerformed(evt);
            }
        });

        jLabel7.setText("Inpit 2");

        txt1.setBackground(new java.awt.Color(0, 102, 204));
        txt1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel3.setText("Input 1");

        jButton3.setText("Thêm");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(in2)
                            .addComponent(in1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel5Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel3, jLabel7});

        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(in1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(26, 26, 26)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(in2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel1.setBackground(new java.awt.Color(204, 255, 204));
        jLabel1.setText("Sau sử lý:");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        out2.setEditable(false);
        out2.setColumns(20);
        out2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        out2.setRows(10);
        jScrollPane2.setViewportView(out2);

        out.setEditable(false);
        out.setColumns(20);
        out.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        out.setRows(5);
        jScrollPane1.setViewportView(out);

        jLabel2.setBackground(new java.awt.Color(204, 255, 204));
        jLabel2.setText("Trước sử lý");
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jDesktopPane1.setLayer(jSeparator1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jSeparator3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jPanel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jScrollPane3)
                        .addContainerGap())))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed

        show1();
    }//GEN-LAST:event_okActionPerformed

    private void box1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box1ActionPerformed


    }//GEN-LAST:event_box1ActionPerformed

    private void box2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box2ActionPerformed

    }//GEN-LAST:event_box2ActionPerformed

    private void box3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box3ActionPerformed

    }//GEN-LAST:event_box3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        show2();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        show3();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(in2.getText().equals("")){
            out2.setText("");
        }else
        add();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void in1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_in1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_in1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> box1;
    private javax.swing.JComboBox<String> box2;
    private javax.swing.JComboBox<String> box3;
    private javax.swing.JTextField in1;
    private javax.swing.JTextField in2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JButton ok;
    private javax.swing.JTextArea out;
    private javax.swing.JTextArea out2;
    private javax.swing.JLabel txt1;
    private javax.swing.JTextArea txt2;
    // End of variables declaration//GEN-END:variables
}
