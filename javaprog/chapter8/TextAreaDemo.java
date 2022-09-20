import java.awt.*;
import java.awt.event.*;
class TextAreaDemo extends Frame
{
	TextArea t;
	TextAreaDemo()
	{ 
		this.setLayout (null);
		t = new TextArea (2, 20);
		t.setBounds(100, 120, 180, 100);
		this.add (t);
		addWindowListener (new WindowAdapter()
		{
			public void windowClosing (WindowEvent e)
			{
				System.exit (0);
			}
		});
	}
	public static void main (String args [])
	{
		TextAreaDemo t = new TextAreaDemo ();
		t.setTitle ("Adding Text Area");
		t.setSize (350,350);
		t.setVisible (true);
	}
}
