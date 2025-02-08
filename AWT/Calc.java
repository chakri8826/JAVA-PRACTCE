import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.*;
class Calc{
		static char c;
		static int val1=0;
		static int val2=0;
	public static void main(String args[]){
		   
		JFrame frame=new JFrame();
		frame.setTitle("RGUKT-CSE Frame");
		frame.setSize(400,400);
		frame.setVisible(true);
		frame.setBackground(Color.green);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container con=frame.getContentPane();
		con.setLayout	(null);
		
		JLabel out=new JLabel();
		out.setText("");
		out.setBounds(30,10,80,30);
		con.add(out);
		 
		 JButton jb1=new JButton();
		 jb1.setText("1");
		 jb1.setBounds(30,50,50,30);
		 con.add(jb1);
		 jb1.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent ae){					
					String s1=jb1.getText();
					String s2 =out.getText();
					 
					out.setText(s2+s1);
					}
		 });	
		 
		
		 JButton jb2=new JButton();
		 jb2.setText("2");
		 jb2.setBounds(90,50,50,30);
		 con.add(jb2);
		 jb2.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent ae){					
					String s1=jb2.getText();
					 String s2 =out.getText();
					 
					out.setText(s2+s1);
					}
		 });	
		 
		  
		 JButton jb3=new JButton();
		 jb3.setText("3");
		 jb3.setBounds(150,50,50,30);
		 con.add(jb3);
		 jb3.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent ae){					
					String s1=jb3.getText();
					 String s2 =out.getText();
					 
					out.setText(s2+s1);
					}
		 });	
		 
		 		 
		 JButton jba=new JButton();
		 jba.setText("+");
		 jba.setBounds(210,50,50,30);
		 con.add(jba);
		 jba.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent ae){					
					//op=jba.getText();
					 String s2 =out.getText();
					 if(s2.equals("")){
					 	System.out.println("Empty");
					 }
					 else{
					 	val1=Integer.parseInt(s2);
					 	c='+';
					 }
					out.setText("");
					}
		 });
		 
		 
		 JButton jb4=new JButton();
		 jb4.setText("4");
		 jb4.setBounds(30,90,50,30);
		 con.add(jb4);
		 jb4.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent ae){					
					String s1=jb4.getText();
					 String s2 =out.getText();
					 
					out.setText(s2+s1);
					}
		 });
		 
		 
		 JButton jb5=new JButton();
		 jb5.setText("5");
		 jb5.setBounds(90,90,50,30);
		 con.add(jb5);
		 jb5.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent ae){					
					String s1=jb5.getText();
					 String s2 =out.getText();
					 
					out.setText(s2+s1);
					}
		 });
		 
		 JButton jb6=new JButton();
		 jb6.setText("6");
		 jb6.setBounds(150,90,50,30);
		 con.add(jb6);
		 jb6.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent ae){					
					String s1=jb6.getText();
					 String s2 =out.getText();
					 
					out.setText(s2+s1);
					}
		 });
		 
		 
		 JButton jbmi=new JButton();
		 jbmi.setText("-");
		 jbmi.setBounds(210,90,50,30);
		 con.add(jbmi);
		 jbmi.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent ae){					
					//op=jbmi.getText();
					 String s2 =out.getText();
					 if(s2.equals("")){
					 	System.out.println("Empty");
					 }
					 else{
					 	val1=Integer.parseInt(s2);
					 	c='-';
					 }
					out.setText("");
					}
		 });	 
		 
		 
		  
		 JButton jb7=new JButton();
		 jb7.setText("7");
		 jb7.setBounds(30,130,50,30);
		 con.add(jb7);
		 jb7.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent ae){					
					String s1=jb7.getText();
					 String s2 =out.getText();
					 
					out.setText(s2+s1);
					}
		 });
		 
		 
		 JButton jb8=new JButton();
		 jb8.setText("8");
		 jb8.setBounds(90,130,50,30);
		 con.add(jb8);
		 jb8.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent ae){					
					String s1=jb8.getText();
					 String s2 =out.getText();
					 
					out.setText(s2+s1);
					}
		 });
		 
		 
		 JButton jb9=new JButton();
		 jb9.setText("9");
		 jb9.setBounds(150,130,50,30);
		 con.add(jb9);
		 jb9.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent ae){					
					String s1=jb9.getText();
					String s2 =out.getText();
					 
					out.setText(s2+s1);
					}
		 });
		 
		 JButton jbmul = new JButton();
		 jbmul.setText("*");
		 jbmul.setBounds(210,130,50,30);
		 con.add(jbmul);
		 jbmul.addActionListener(new ActionListener(){
		 	public void actionPerformed(ActionEvent ae){
		 		String s2 = out.getText();
		 		if(s2.equals("")){
		 			System.out.println("Empty");
		 		} 
		 		else{
		 			val1=Integer.parseInt(s2);
		 			c='*';
		 		}
		 		out.setText("");
		 	}
		 });
		 
		   
		 JButton jbw = new JButton();
		 jbw.setText("x");
		 jbw.setBounds(30,170,50,30);
		 con.add(jbw);
		 
		 jbw.addActionListener(new ActionListener(){
		 	public void actionPerformed(ActionEvent ae){
		 		String s2 = out.getText();
		 		if(s2.equals("")){
		 			System.out.println("Empty");
		 		} 
		 		else{
		 			int l = s2.length();
		 			s2=s2.substring(0,l-1);
		 			out.setText(s2); 
		 		}
		 	}
		 });
		 
		  
		 JButton jb0=new JButton();
		 jb0.setText("0");
		 jb0.setBounds(90,170,50,30);
		 con.add(jb0);
		 jb0.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent ae){					
					String s1=jb0.getText();
					String s2 =out.getText();
					 
					out.setText(s2+s1);
					}
		 });
		  
		 JButton jbd = new JButton();
		 jbd.setText("/");
		 jbd.setBounds(150,170,50,30);
		 con.add(jbd);
		 jbd.addActionListener(new ActionListener(){
		 	public void actionPerformed(ActionEvent ae){
		 		String s2 = out.getText();
		 		if(s2.equals("")){
		 			System.out.println("Empty");
		 		} 
		 		else{
		 			val1=Integer.parseInt(s2);
		 			c='/';
		 		}
		 		out.setText("");
		 	}
		 });
		 
		 
		 
		 
		 JButton jbe=new JButton();
		 jbe.setText("=");
		 jbe.setBounds(210,170,50,30);
		 con.add(jbe);
		 jbe.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent ae){					
					//op=jbe.getText();
					 String s2 =out.getText();
					 if(c==' '){
					 	out.setText("");		 
					 }
					 else if(s2.equals("")){
					 	System.out.println("Empty");
					 }
					 
					 else{
					 	val2=Integer.parseInt(s2);
					 	int res=0;
					 	if(c=='+'){
						 	 res=(val1+val2);
						}
						else if(c=='-'){
						 	 res=(val1-val2);
						}
						else if(c=='*'){
						 	  res=(val1*val2);
						}
						else if(c=='/'){
						 	 res=(val1/val2);
						}
						String op=String.valueOf(res);
						out.setText(op);
					}
					c=' ';	   
				}
		 });
		 
		 
		 JButton clear=new JButton();
		 clear.setText("Clear");
		 clear.setBounds(105,210,80,40);
		 con.add(clear);
		 clear.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				out.setText("");
			}
		 }
		 );	
	}
}
