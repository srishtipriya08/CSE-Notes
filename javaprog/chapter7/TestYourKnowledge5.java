import java.awt.*;
import java.applet.*;
/*
<applet code=" TestYourKnowledge5.class" 
 	width=300
 	height=300>
</applet>
*/
public class TestYourKnowledge5 extends Applet
{
	public void paint(Graphics g)
	{
		g.drawLine(10, 0, 10, 100);
		g.drawLine(10, 100, 100, 200);
		g.drawLine(100, 200, 10, 0);
	}
}
