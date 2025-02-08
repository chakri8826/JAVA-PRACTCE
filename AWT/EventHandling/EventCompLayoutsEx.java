import java.awt.*;
import java.awt.event.*;
class EventButton extends Frame implements ActionListener{
	Button b1,b2,b3,b4;
	Label l;
	EventButton(){
		setTitle("Button");
		setVisible(true);
		setSize(700,300);
		
		BorderLayout b = new BorderLayout();
		setLayout(b);
		setBackground(Color.green);
		b1=new Button("North");
		b2=new Button("South");
		b3=new Button("East");
		b4=new Button("West");
		l = new Label();
		l.setAlignment(Label.CENTER);
		add(b1,BorderLayout.NORTH);
		add(b2,BorderLayout.SOUTH);
		add(b3,BorderLayout.EAST);
		add(b4,BorderLayout.WEST);
		add(l);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		addWindowListener(new  WindowAdapter(){
			 public void windowClosing(WindowEvent we){
				 
				System.exit(0);
			 }
		});
	}
	public void actionPerformed(ActionEvent ae){
		if(ae.getSource()==b1){
			System.out.println("You have clicked:"+b1.getLabel());
			String s1 = b1.getLabel();//North
			l.setText(s1);
		}
		if(ae.getSource()==b2){
			System.out.println("You have clicked:"+b2.getLabel());
			l.setText(b2.getLabel());
		}
		if(ae.getSource()==b3){
			System.out.println("You have clicked:"+b3.getLabel());
			l.setText(b3.getLabel());
		}
		if(ae.getSource()==b4){
			System.out.println("You have clicked:"+b4.getLabel());
			l.setText(b4.getLabel());
		}
				
	}
	 
	 
	
	 
}

class EventCompLayoutsEx{
	public static void main(String args[]){
		new EventButton();
	}
}





