import java.awt.*; 
class ExtendFrame extends Frame{
	ExtendFrame(){
		setTitle("Extending Frame Class");
		setSize(500,500);
		setVisible(true);
		setBackground(Color.green);
	}
	 
}
class ExtendFrameDemo{
	public static void main(String[] args){
		ExtendFrame ef = new ExtendFrame();
	}
}
