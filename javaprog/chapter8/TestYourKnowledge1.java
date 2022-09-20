import java.awt.*;
import java.awt.event.*;
class TestYourKnowledge1 extends Frame
{
	Button b1, b2, b3, b4;
	TestYourKnowledge1()
	{ 
		this.setLayout (new BorderLayout()); // Setting the layout 
		b1 = new Button ("Border 1");
		b2 = new Button ("Border 2");
		b3 = new Button ("Border 3");
		b4 = new Button ("Border 4");
		this.add ("East",b1);
		this.add ("West", b2);
		this.add ("North", b3);
		this.add ("South", b4);

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

		TestYourKnowledge1 b = new TestYourKnowledge1 ();
		b.setTitle ("Border Layout");// setting frame title 
		b.setSize (300,300);// setting frame size 
		b.setVisible (true);

	}

}
