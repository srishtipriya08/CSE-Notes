import java.awt.*;
import java.awt.event.*;

public class CreateImage extends Frame 
{
	Image image;

	public CreateImage() 
	{
	this.setLayout (null);
	Font f=new Font("TimesRoman",Font.BOLD,28);
	setBackground(Color.pink);
	Toolkit toolkit = Toolkit.getDefaultToolkit().createImage(image);
	Graphics gimg=image.getGraphics();
	gimg.setColor(getBackground());
	gimg.fillRect(0,0,300,75);
	gimg.setColor(Color.red);
	gimg.setFont(f);
	gimg.drawString("Hi! I am an image",20,20);
	addWindowListener(new WindowAdapter() {
      		public void windowClosing(WindowEvent e) {
        		System.exit(0);
      		}
		});
	}
	public void paint(Graphics g)
	{
		g.drawImage(image,50,30,this);
	}
public static void main(String args[])
{
		CreateImage i = new CreateImage();
		i.setTitle("Image Demo");
		i.setSize(300,300);
		i.setVisible(true);
}
}
