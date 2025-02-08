import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class factorial {
    public static void main(String args[]) {
        JFrame frame = new JFrame();
        frame.setTitle("Factorial");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container con = frame.getContentPane();
        con.setLayout(null);

        JTextField input = new JTextField();
        input.setLocation(30, 5);
        input.setSize(70, 40);
        con.add(input);

        JTextField output = new JTextField();
        output.setLocation(110, 5);
        output.setSize(250, 40);
        con.add(output);

        JButton b = new JButton("Compute");

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Float num=Float.parseFloat(input.getText());
                if (num == 0)
                    output.setText("1");
                else if (num < 0)
                    output.setText("Cannot find factorial");
                else {
                    int fact = 1;
                    for (int i = 1; i <= num; i++) {
                        fact = fact * i;
                    }
                    output.setText(fact + "");
                }
            }
        });
        b.setLocation(100, 50);
        b.setSize(150, 50);
        con.add(b);
        frame.setVisible(true);
    }
}
