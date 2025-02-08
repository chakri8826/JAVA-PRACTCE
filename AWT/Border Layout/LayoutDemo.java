import java.awt.*;
import java.awt.event.*;
 
class Layout extends Frame{
	Layout(){
		setTitle("LAYOUT");
		setVisible(true);
		setSize(700,300);
		setBackground(Color.green);
		
		/*BorderLayout b = new BorderLayout(10,10);  // 10,10 GAP B/W EACH BUTTON
		setLayout(b); // Telling to compiler -> Border Layout
		Button b1 = new Button("North");
		Button b2 = new Button("South");
		Button b3 = new Button("East");
		Button b4 = new Button("West");
		Button b5 = new Button("Center");
		add(b1,BorderLayout.NORTH);
		add(b2,BorderLayout.SOUTH);
		add(b3,BorderLayout.EAST);
		add(b4,BorderLayout.WEST);
		add(b5,BorderLayout.CENTER);
		
		FlowLayout b = new FlowLayout(FlowLayout.LEFT,50,50);  // 10,10 GAP B/W EACH BUTTON AND ALLIGNING TO LEFT SIDE
 		setLayout(b); // Telling to compiler -> Flow Layout
		Button b1 = new Button("North");
		Button b2 = new Button("South");
		Button b3 = new Button("East");
		Button b4 = new Button("West");
		Button b5 = new Button("Center");
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);*/
		
		GridLayout b = new GridLayout(3,3,10,10);   // 10,10 GAP B/W EACH BUTTON AND 3 ROWS AND 3 COLS
 		setLayout(b); // Telling to compiler -> Grid Layout
		Button b1 = new Button("A");
		Button b2 = new Button("B");
		Button b3 = new Button("C");
		Button b4 = new Button("D");
		Button b5 = new Button("E");
		Button b6 = new Button("F");
		Button b7 = new Button("G");
		Button b8 = new Button("H");
		Button b9 = new Button("I");
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(b9);
		
		
		
		//Instead of writing separate classes like ExWindow creating obj directly with Anonymous inner classes to reduce lines of code.
		addWindowListener(new  WindowAdapter(){
			  public void windowClosing(WindowEvent we){
				System.exit(0);
			 }
		});
	}
}
class LayoutDemo{
	public static void main(String args[]){
		Layout eh = new Layout();
	}
	
}




