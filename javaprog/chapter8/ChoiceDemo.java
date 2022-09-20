import java.awt.*;
import java.awt.event.*;

class ChoiceDemo extends Frame implements ItemListener
{
	Label lab; 
	Choice ch;
	ChoiceDemo()
	{ 
		this.setLayout (null);

		lab = new Label ("Color");
		lab.setBounds (60, 130, 50, 50);

		ch = new Choice ();
		ch.add ("Red");
		ch.add ("Blue");
		ch.add ("Pink");
		ch.add ("White");
		ch.setBounds (130,145, 100, 20);
		ch.addItemListener(this);
		this.add (lab);
		this.add (ch);

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
		ChoiceDemo c = new ChoiceDemo ();
		c.setTitle ("Creating Pop-up choice menu");
		c.setSize (350,350);
		c.setVisible (true);
	}
	public void itemStateChanged(ItemEvent ie)
	{
		int s;
		s = ch.getSelectedIndex();
		if(s == 0)
		{
			setBackground(Color.red);
			lab.setBackground(Color.red);
		}
		else if(s == 1)
		{
			setBackground(Color.blue);
			lab.setBackground(Color.blue);
		}
		else if(s == 2)
		{
			setBackground(Color.pink);
			lab.setBackground(Color.pink);
		}
		else if(s == 3)
		{
			setBackground(Color.white);
			lab.setBackground(Color.white);
		}
	}
}
