import java.awt.*;
import java.applet.*;
/*
<applet code="DrawArc.class" 
	  width=500
	  height=250>
</applet>
*/
public class TestYourKnowledge2 extends Applet
{
	public void paint(Graphics g)
	{
		setForeground(Color.red);
		g.drawArc(200, 80, 80, 80, 0, 180);
	}
}
