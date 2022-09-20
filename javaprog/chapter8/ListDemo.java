import java.awt.*;
import java.awt.event.*;

class ListDemo extends Frame implements ItemListener
{
	List l;
	Label lab;
	ListDemo()
	{
		this.setLayout (null);
		lab = new Label ("Color");
		lab.setBounds (60, 130, 50, 50);

		l = new List();
		l.add("Red");
		l.add("Blue");
		l.add("Pink");
		l.add("White");
		l.addItemListener(this);
		l.setBounds(130,145, 100, 50);
		add(lab);
		add(l);
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing (WindowEvent e)
			{
				System.exit (0);
			}
		});
	}
	public void itemStateChanged(ItemEvent ie)
	{
		int s;
		s = l.getSelectedIndex();
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
	public static void main(String args [])
	{
		ListDemo d = new ListDemo();
		d.setTitle("Creating List");
		d.setSize (350,350);
		d.setVisible(true);
	}


}
