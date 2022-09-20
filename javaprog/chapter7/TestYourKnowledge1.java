import java.applet.*;
import java.awt.*;

/*
<applet code="TestYourKnowledge1.class" width=200 height=200>
</applet>
*/
public class TestYourKnowledge1 extends Applet
{
	StringBuffer sb;
	public void init()
	{
		sb = new StringBuffer();
		addItem("Initializing applet...");
	}
	public void start()
	{
		addItem("Starting applet...");
	}
	public void stop()
	{
		addItem("Stopping applet...");
	}
	public void destroy()
	{
		addItem("Unloading applet...");
	}
	private void addItem(String newText)
	{
		System.out.println(newText);
		sb.append(newText);
		repaint();
	}
	public void paint(Graphics g)
	{
		// draw string contained in sb
		g.drawString(sb.toString(), 5,10);

	}
}
