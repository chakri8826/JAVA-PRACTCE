import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class GUIFrame{
	public static void main(String args[]){
		JFrame frame=new JFrame();
		frame.setTitle("RGUKT-CSE Frame");
		frame.setSize(400,400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container con=frame.getContentPane();
		con.setLayout	(null);
		
		JLabel msg1=new JLabel();
		msg1.setText("User Name");
		msg1.setBounds(30,10,80,30);
		con.add(msg1);
		
		JLabel msg2=new JLabel();
		msg2.setText("Password: ");
		msg2.setBounds(30,45,80,30);
		con.add(msg2);
		
		JTextField uname=new JTextField();
		uname.setText("");
		uname.setBounds(120,10,80,30);
		con.add(uname);
		 
		JLabel out=new JLabel();
		out.setText("");
		out.setBounds(170,120,80,30);
		con.add(out);
		 
		 JTextField pwd=new JTextField();
		 pwd.setText("");
		 pwd.setBounds(120,45,80,30);
		 con.add(pwd);
		 
		 JButton submit=new JButton();
		 submit.setText("LogIn");
		 submit.setBounds(60,80,80,30);
		 con.add(submit);
		 submit.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent ae){					
					String name=uname.getText();
					String pw=pwd.getText();
					System.out.println("Clicked..."+name+" "+pw);
					out.setText(name+" "+pw);
					}
		 });
		 
		 	 
		 JButton clear=new JButton();
		 clear.setText("Clear");
		 clear.setBounds(150,80,80,30);
		 con.add(clear);
		 clear.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
				uname.setText("");
				pwd.setText("");
			}
		 }
		 );
		 
		
		
	}
}
