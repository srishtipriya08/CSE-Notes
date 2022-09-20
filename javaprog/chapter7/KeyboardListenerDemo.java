import java.awt.*; 
import java.awt.event.*;
import java.applet.Applet;

/*
<applet CODE=KeyboardListenerDemo.class WIDTH=300 HEIGHT=200>
</applet>

*/

public class KeyboardListenerDemo extends Applet implements KeyListener
{
	public void init()
	{
		Label label = new Label ("Enter any character :");
		add(label);
		TextField textField = new TextField(20);
		add(textField);
		textField.addKeyListener(this);
	}
	public void keyPressed(KeyEvent e)
	{}
	public void keyReleased(KeyEvent e)
	{}
	public void keyTyped(KeyEvent e)
	{
		showStatus(" Recently typed character is : " + e.getKeyChar());
	}
}
