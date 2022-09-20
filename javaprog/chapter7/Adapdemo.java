import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*
<applet CODE=Adapdemo.class WIDTH=300 HEIGHT=200>
</applet>

*/
public class Adapdemo extends Applet 
{
	public String myMessage = "x = ?, y = ?";

	public void init()
	{
		// tell the applet to listen for mouse related events
		addMouseListener(new MyAdapter (this)); 
		
	}
	public void paint(Graphics g)
	{
		System.out.println("paint called");
		g.drawString(myMessage, 50, 50);
	}
}

class MyAdapter extends MouseAdapter
{
	Adapdemo ad;
	MyAdapter(Adapdemo ad)
	{
		this.ad=ad;
	}
	// Respond to a mouse press on applet
	public void mousePressed(MouseEvent me) 
	{
		// display the x and y coordinate of mouse pointer
		ad.myMessage = "x = " + me.getX() + ", y = " + me.getY();
		ad.repaint();
	}
}
