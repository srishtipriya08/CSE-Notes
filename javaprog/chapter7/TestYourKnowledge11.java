import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*
<applet CODE= TestYourKnowledge11.class WIDTH=300 HEIGHT=200>
</applet>

*/
public class TestYourKnowledge11 extends Applet implements MouseListener
{
	public String message = "x = ?, y = ?";

	public void init()
	{
		// tell the applet to listen for mouse related events
		addMouseListener(this); 
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString(message, 50, 50);
	}

	// Respond to a mouse press on applet
	public void mousePressed(MouseEvent mEvent) 
	{
		// display the x and y coordinate of mouse pointer
		message = "x = " + mEvent.getX() + ", y = " + mEvent.getY();
		System.out.println("mouse button pressed");	
		repaint();
	}
	// you must implement all the methods of MouseListener interface. 
	public void mouseClicked(MouseEvent mEvent)
	{
		System.out.println("mouse button clicked");
	}
	public void mouseEntered(MouseEvent mEvent)
	{
		System.out.println("mouse enter in applet window");
	}
	public void mouseExited(MouseEvent mEvent)
	{
		System.out.println("mouse exit in applet window");
	}
	public void mouseReleased(MouseEvent mEvent)
	{
		System.out.println("mouse released in applet window");
	}
	
}

