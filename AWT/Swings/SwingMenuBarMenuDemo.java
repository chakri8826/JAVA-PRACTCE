import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class JMenuBarMenu extends JFrame implements ActionListener{
	JMenuBar mb;
	JMenu m1,m2,m3,m4;
	JMenuItem mi1,mi2,mi3,mi4,mi5,mi6,mi7,mi8,mi9;
	JCheckBoxMenuItem cmi1,cmi2,cmi3;
	Label l;
	JMenuBarMenu(){
		setTitle("MENU AND MENU BAR");
		setVisible(true);
		setSize(700,300);
		setBackground(Color.green);
		
		mb = new JMenuBar(); //creates a menubar
		setJMenuBar(mb);//add menu bar to the frame
		
		m1 = new JMenu("File");		
		m2 = new JMenu("Edit");		
		m3 = new JMenu("Window");
				
		m4 = new JMenu("NewFlipBook");
		
		mi1 = new JMenuItem("New");
		mi2 = new JMenuItem("Open");
		mi3 = new JMenuItem("Save");
		mi4 = new JMenuItem("New Empty FB");
		mi5 = new JMenuItem("New Image FB");
		mi6 = new JMenuItem("Undo");
		mi7 = new JMenuItem("Redo");
		mi8 = new JMenuItem("Cut");
		mi9 = new JMenuItem("Exit");
		
		cmi1 = new JCheckBoxMenuItem("Lagoon");
		cmi2 = new JCheckBoxMenuItem("Brush Pallette");
		cmi3 = new JCheckBoxMenuItem("Brush Library");
				
		mb.add(m1);
		mb.add(m2);
		mb.add(m3);
		
		m1.add(mi1);
		m1.add(mi2);
		m1.add(mi3);
		m1.add(m4);  //adding NewFlipBook to File Menu (adding menu as a menuitem)
		m4.add(mi4);
		m4.add(mi5);
		m1.add(mi9);
		
		m2.add(mi6);
		m2.add(mi7);
		m2.add(mi8);
		
		m3.add(cmi1);
		m3.add(cmi2);
		m3.add(cmi3);		
		
		l=new Label("Clicked display here ",Label.CENTER);
		add(l);
		
		mi1.addActionListener(this);
		mi2.addActionListener(this);
		mi3.addActionListener(this);
		mi9.addActionListener(this);
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we){
				System.exit(0);	
			}
		});
	}
	
	public void actionPerformed(ActionEvent ae){
		if(ae.getActionCommand().equals("New")){
			l.setText("New Menu Item Clicked");
		}
		else if(ae.getActionCommand().equals("Open")){
			l.setText("Open Menu Item Clicked");
		}
		else if(ae.getActionCommand().equals("Save")){
			l.setText("Save Menu Item Clicked");
		}
		else if(ae.getActionCommand().equals("Exit")){
			System.exit(0);	
		}
	}
}
class SwingMenuBarMenuDemo{
	public static void main(String args[]){
		  new MenuBarMenu();
	}
	
}
