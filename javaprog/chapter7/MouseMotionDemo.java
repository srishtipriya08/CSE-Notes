import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

/*
<applet code="FreeHandSketch.class" 
			  width=300
			  height=300>
</applet>
*/

public class MouseMotionDemo extends Applet implements MouseListener, MouseMotionListener
{
	int width, height;
	Vector listPositions;
	public void init()
	{
		width = getSize().width;
		height = getSize().height;
		setBackground( Color.BLACK );
		listPositions = new Vector();
		addMouseListener( this );
		addMouseMotionListener( this );
	}

	public void mouseEntered( MouseEvent me ) { }
	public void mouseExited( MouseEvent me ) { }
	public void mouseClicked( MouseEvent me ) { }
	public void mousePressed( MouseEvent me ) { }
	public void mouseReleased( MouseEvent me ) { }
	public void mouseMoved( MouseEvent me )
	{
		if ( listPositions.size() >= 50 )
		{
			// delete the first element in the listPositions list
			listPositions.removeElementAt( 0 );
		}
		// add the new position to the end of the listPositions list
		listPositions.addElement( new Point(me.getX(), me.getY()) );
		repaint();
		me.consume();
	}
	public void mouseDragged( MouseEvent me ) { }
	public void paint( Graphics g )
	{
		g.setColor( Color.RED );
		for ( int i = 1; i < listPositions.size(); ++i )
		{
			Point P1 = (Point)(listPositions.elementAt(i-1));
			Point P2 = (Point)(listPositions.elementAt(i));
			g.drawLine( P1.x, P1.y, P2.x, P2.y );
		}
	}
}
