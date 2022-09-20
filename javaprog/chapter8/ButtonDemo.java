import java.awt.*;
import java.awt.event.*;

class ButtonDemo extends Frame implements ActionListener
{

	//Declaring buttons	
	private Button b1;
	private Button b2;
	ButtonDemo()
	{ 

		this.setLayout (null);// setting layout to null 
		//Instantiating Buttons
		b1 = new Button("Pink");
		b2 = new Button("Blue");
		
		//adding buttons to the frame
		add(b1);
		add(b2); 
		
		//setting labels for button
		b1.setLabel("Pink Background");
		b2.setLabel("Blue Background");
		b1.setBounds (100, 200, 100, 40);
		b2.setBounds (300, 200, 100, 40);

		//Handling button events
		b1.addActionListener(this);
		b1.setActionCommand("pink");
		b2.addActionListener(this);
		
		//setting second button disenabled
		b2.setEnabled(false);
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		String action;
		action = e.getActionCommand();
		if(action.equals("pink"))
		{
			setBackground(Color.pink);
			b1.setEnabled(false);
			b2.setEnabled(true);
		}
		else if(action.equals("Blue Background"))
		{
			setBackground(Color.blue);
			b1.setEnabled(true);
			b2.setEnabled(false);
		}
	}
	public static void main (String args[])
	{

		ButtonDemo c = new ButtonDemo();
		c.setTitle ("Adding Button"); // setting frame title 
		c.setSize (300,300);// setting frame size 
		c.setVisible (true);
		//Handling closing of window
		c.addWindowListener (new WindowAdapter(){
			public void windowClosing (WindowEvent e)
			{
				System.exit (0);
			}
		});

	}
}
