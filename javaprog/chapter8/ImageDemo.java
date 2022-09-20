import java.awt.*;
import java.awt.event.*;

public class ImageDemo extends Frame {
	private Image image;

	public ImageDemo() 
	{
	this.setLayout (null);
	Toolkit toolkit = Toolkit.getDefaultToolkit();
	image=toolkit.getImage("java.jpg");

	addWindowListener(new WindowAdapter() {
      		public void windowClosing(WindowEvent e) {
        		System.exit(0);
      		}
		});
	}
	
	public void paint(Graphics graphics) {
		graphics.drawImage(image, 0, 0, null);
	}

	public static void main(String[] args) {
		ImageDemo i = new ImageDemo();
		i.setTitle("Image Demo");
		i.setSize(300,300);
		i.setVisible(true);
	}
}
