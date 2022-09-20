import java.awt.*;
import java.awt.event.*;

class DemoFrame4 extends Frame implements MouseMotionListener
{
	int x, y;
	String msg = " ";
	public DemoFrame4(String s)
	{
		super(s);
		setBackground(Color.pink);
		setForeground(Color.blue);
		setSize(200,200);
		setVisible (true);
		MyWindowAdapter adapter = new MyWindowAdapter(this);
		addWindowListener(adapter);
		addMouseMotionListener(this);
	}

	public void mouseDragged(MouseEvent me)
	{
		x = me.getX();
		y = me.getY();
		msg = "Mouse Dragged at (" + x + "," + y + ")";
		repaint();
	}

	public void mouseMoved(MouseEvent me)
	{
		x = me.getX();
		y = me.getY();
		msg = "Mouse Moved at (" + x + "," + y + ")";
		repaint();
	}

	public void paint(Graphics g)
	{
		g.drawString(msg, x, y);
	}
	public static void main(String args[])
	{
		DemoFrame4 d = new DemoFrame4("This is my window");

	}
}
	class MyWindowAdapter extends WindowAdapter
	{
		DemoFrame4 df;
		public MyWindowAdapter(DemoFrame4 df)
		{
			this.df = df;
		}
		public void windowClosing(WindowEvent we)
		{
			System.exit (0);
		}
}