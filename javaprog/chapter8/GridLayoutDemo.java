import java.awt.*;
import java.awt.event.*;
class GridLayoutDemo extends Frame
{
	Button b1, b2, b3, b4;
	GridLayoutDemo()
	{ 
		this.setLayout (new GridLayout(2,2)); // Seting layout 
		b1 = new Button ("A");
		b2 = new Button ("B");
		b3 = new Button ("C");
		b4 = new Button ("D");
		this.add (b1);
		this.add (b2);
		this.add (b3);
		this.add (b4);
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
		GridLayoutDemo g = new GridLayoutDemo();
		g.setTitle("Grid Layout");// setting frame title 
		g.setSize(300,300);// setting frame size 
		g.setVisible(true);

	}
}
