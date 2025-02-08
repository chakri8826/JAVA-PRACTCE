import java.awt.*;
import java.awt.event.*;
class ComponentClass extends Frame{
	ComponentClass(){
		setTitle("WINDOW");
		setVisible(true);
		setSize(700,300);
		//	setBackground(Color.green);
		/*Label l = new Label("Enter name: ",Label.CENTER);
		Label l = new Label();
		l.setText("Enter name: ");
		l.setAlignment(Label.CENTER);
		add(l);
		
		Button b = new Button("Enter");
		add(b);
		
		TextField t1 = new TextField("Enter your name: ");
		t1.setEchoChar('*');
		add(t1);
		
		TextArea t1 = new TextArea("Enter your Address: ",5,8 );
		add(t1);
		
		Choice c = new Choice();
		c.add("cse");
		c.add("ece");
		c.add("mech");
		
		List l = new List(5,true);
		l.add("one");
		l.add("two");
		l.add("three");
		l.add("one");
		l.add("two");
		l.add("three");
		add(l);
		
		
		Checkbox cb = new Checkbox("10th Class");
		Checkbox cb1 = new Checkbox("Inter");
		Checkbox cb2 = new Checkbox("B Tech");
		Checkbox cb3 = new Checkbox("M Tech");
		add(cb);
		add(cb1);
		add(cb2);
		add(cb3);*/
		
		//Creating a radio box
		CheckboxGroup gender = new CheckboxGroup();
		Checkbox m = new Checkbox("Male",false,gender);
		Checkbox f = new Checkbox("Female",false,gender);
		Checkbox o = new Checkbox("Others",false,gender);
		add(m);
		add(f);
		add(o);
		
				
		//Instead of writing separate classes like ExWindow creating obj directly with Anonymous inner classes to reduce lines of code.
		addWindowListener(new  WindowAdapter(){
			 public void windowIconified(WindowEvent we){
				System.out.println("From minimize state to normal state");
			 }
			 public void windowClosing(WindowEvent we){
				System.exit(0);
			 }
		});
	}
}
class ComponentClassDemo{
	public static void main(String args[]){
		ComponentClass eh = new ComponentClass();
	}
	
}

