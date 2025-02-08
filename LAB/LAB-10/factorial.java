import javax.swing.*;

import java.awt.Container;
import java.awt.event.*;
public class factorial {
    public static void main(String[] args) {
        JFrame j = new JFrame();
        j.setTitle("Factorial");
        j.setSize(500,500);
        j.setVisible(true);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = j.getContentPane();
        c.setLayout(null);

        JTextField inp= new JTextField();
        inp.setBounds(20,20,80,30);
        c.add(inp);

        JTextField out= new JTextField();
        out.setText("");
        out.setBounds(200,20,80,30);
        c.add(out);

        JButton b = new JButton("Compute");
        b.setBounds(100,60,100,30);
        c.add(b);
        b.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    String s = inp.getText();
                    int n = Integer.parseInt(s);
                    int fact=1;
                    while(n>1){
                        fact*=n;
                    }
                    // String op = String.valueOf(fact);
                    out.setText(fact+" ");
                }
        });
        c.add(b);

        
        
    }
}
