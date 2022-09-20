import java.awt.*;
import java.applet.*;
/*
<applet code="TestYourKnowledge4.class" 
	width=300
	height=300>
</applet>
*/
public class TestYourKnowledge4 extends Applet
{
	int width, height;
	public void init()
	{
		width = getSize().width;
		height = getSize().height;
	}
	public void paint(Graphics g)
	{
		for ( int i = 0; i < 20; ++i ) {
        		g.drawLine( width, height, i * width / 20, 0 );
		}
	}
}

