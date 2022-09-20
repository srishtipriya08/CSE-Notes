import java.applet.Applet;
import java.awt.*;
/* <APPLET
	CODE= TestYourKnowledge8.class
	WIDTH=200
	HEIGHT=200 >
	<PARAM NAME = country VALUE = "India">
</APPLET>>  */

public class TestYourKnowledge8 extends Applet
{
	String country;
	public void start()
	{
		country = getParameter("country");
	}
	public void paint(Graphics g)
	{
		g.drawString(country, 10, 100);
	}
}
