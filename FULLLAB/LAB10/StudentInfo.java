import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
public class StudentInfo {
    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.setTitle("Student info");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container con = frame.getContentPane();
        con.setLayout(null);

        JLabel head=new JLabel("Enter Details:");
        head.setLocation(100,20);
        head.setSize(100, 20);
        con.add(head);

        JLabel name=new JLabel("Name:");
        name.setLocation(10,50);
        name.setSize(100, 20);
        con.add(name);

        JTextField nameIn = new JTextField();
        nameIn.setLocation(90, 50);
        nameIn.setSize(200, 20);
        con.add(nameIn);

        JLabel age=new JLabel("Age:");
        age.setLocation(10,80);
        age.setSize(100, 20);
        con.add(age);

        JTextField ageIn = new JTextField();
        ageIn.setLocation(90, 80);
        ageIn.setSize(200, 20);
        con.add(ageIn);

        JLabel mail=new JLabel("Mail:");
        mail.setLocation(10,110);
        mail.setSize(100, 20);
        con.add(mail);

        JTextField mailIn = new JTextField();
        mailIn.setLocation(90, 110);
        mailIn.setSize(200, 20);
        con.add(mailIn);

        JLabel status=new JLabel("NotRegistered");
        status.setLocation(10,190);
        status.setSize(350, 20);
        con.add(status);

        JButton b = new JButton("Register");

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try{
                FileWriter fw=new FileWriter("Students.txt",true);
                BufferedWriter bw=new BufferedWriter(fw);
                bw.write("Name:"+nameIn.getText()+"\n");
                bw.write("Age:"+ageIn.getText()+"\n");
                bw.write("Mail:"+mailIn.getText()+"\n");
                bw.close();
                }
                catch(Exception err){}
               status.setText("Registered. Enter next Student Details");
               nameIn.setText("");
               ageIn.setText("");
               mailIn.setText("");
            }
        });
        b.setLocation(60, 140);
        b.setSize(100, 30);
        con.add(b);
        frame.setVisible(true);
    }
    
}
