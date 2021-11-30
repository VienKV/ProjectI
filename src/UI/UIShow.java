package UI;

import javax.swing.*;

public class UIShow extends javax.swing.JFrame {
    private JPanel panel1;
    private JButton showButton;
    private JTextField textFieldBai;
    private JTextField textFieldWeek;

    public UIShow(String title) {
        super(title);
        this.setTitle(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(panel1);
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);
        showButton.addActionListener(actionEvent -> {
            RunExec r = new RunExec();
            String s = r.process(textFieldWeek.getText(), textFieldBai.getText());
            if (s=="Error"){
                JOptionPane.showMessageDialog(this, "Mời bạn nhập lại");
            }
            else {
                JOptionPane.showMessageDialog(this, s, textFieldWeek.getText() + " " + textFieldBai.getText(), JOptionPane.PLAIN_MESSAGE);
            }
        });
    }



    public static void main(String[] args) {
        UIShow a = new UIShow("UIShow");
    }

}
