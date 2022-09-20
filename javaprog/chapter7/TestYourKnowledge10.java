import java.applet.*;
import java.awt.*;
/*
<applet code="TestYourKnowledge10.class" width=300 height=300>
</applet>
*/
public class TestYourKnowledge10 extends Applet
{
	public void paint(Graphics g)
	{
		setForeground(Color.red);
		Font times = new Font("Times New Roman", Font.BOLD, 30);
		g.setFont(times);
		g.drawString("Good Font", 10, 150);
	}
}

