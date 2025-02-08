import java.awt.*;
import java.awt.event.*;
class KeyListeners extends Frame implements KeyListener{
	KeyListeners(){
		setTitle("Mouse");
		setVisible(true);
		setSize(700,300);
		setBackground(Color.green);
		addKeyListener(this);
		addWindowListener(new  WindowAdapter(){
			 public void windowIconified(WindowEvent we){
				System.out.println("From minimize state to normal state");
			 }
			 public void windowClosing(WindowEvent we){
				 
				System.exit(0);
			 }
		});
	}
	public void keyPressed(KeyEvent ke){
		System.out.println("Key Pressed: "+ke.getKeyChar());
	}
	public void keyReleased(KeyEvent ke){
		System.out.println("Key Released: "+ke.getKeyChar());
	}
	public void keyTyped(KeyEvent ke){
		System.out.println("Key Typed: "+ke.getKeyChar());
	}
	 
	
	 
}

class KeyEventEx{
	public static void main(String args[]){
		new KeyListeners();
	}
}





