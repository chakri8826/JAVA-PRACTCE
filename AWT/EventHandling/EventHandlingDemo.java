import java.awt.*;
import java.awt.event.*;
class ExWindow implements WindowListener{
	public void windowActivated(WindowEvent we){
		System.out.println("Window Activated");
	}
	public void windowDeactivated(WindowEvent we){
		System.out.println("Window Deactivated");
	}
	
	public void windowDeiconified(WindowEvent we){
		System.out.println("From minimize state to normal state");
	}
	public void windowIconified(WindowEvent we){
		System.out.println("From minimize state to normal state");
	}
	public void windowClosing(WindowEvent we){
		System.out.println("Window Closed");
		System.exit(0);
	}
	public void windowClosed(WindowEvent we){
		System.out.println("Window Closed from windowClosed method");
	}
	public void windowOpened(WindowEvent we){
		System.out.println("Window Opened");
	}
}
class EventHandling extends Frame{
	EventHandling(){
		setTitle("WINDOW");
		setVisible(true);
		setSize(700,300);
		setBackground(Color.green);
		addWindowListener(new ExWindow());
	}
}
class EventHandlingDemo{
	public static void main(String args[]){
		EventHandling eh = new EventHandling();
	}
	
}
