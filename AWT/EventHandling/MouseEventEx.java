import java.awt.*;
import java.awt.event.*;
class MouseListeners extends Frame implements MouseListener{
	MouseListeners(){
		setTitle("Mouse");
		setVisible(true);
		setSize(700,300);
		setBackground(Color.green);
		addMouseListener(this);
		addWindowListener(new  WindowAdapter(){
			 public void windowIconified(WindowEvent we){
				System.out.println("From minimize state to normal state");
			 }
			 public void windowClosing(WindowEvent we){
				System.out.println("Window Closed");
				System.exit(0);
			 }
		});
	}
	public void mouseClicked(MouseEvent ae){
		System.out.println("Mouse Clicked"+ae.getX()+" "+ae.getY());
	}
	public void mousePressed(MouseEvent ae){
		System.out.println("Mouse Pressed"+ae.getX()+" "+ae.getY());
	}
	public void mouseReleased(MouseEvent ae){
		System.out.println("Mouse Released"+ae.getX()+" "+ae.getY());
	}
	public void mouseEntered(MouseEvent ae){
		System.out.println("Mouse Entered"+ae.getX()+" "+ae.getY());
	}
	public void mouseExited(MouseEvent ae){
		System.out.println("Mouse Exited"+ae.getX()+" "+ae.getY());
	}
}

class MouseEventEx{
	public static void main(String args[]){
		new MouseListeners();
	}
}





