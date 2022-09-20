import java.awt.*;
import java.awt.event.*;
public class TestYourKnowledge3 extends Frame {
	Image image;
	public TestYourKnowledge3() 
	{
	this.setLayout (null);
	Toolkit toolkit = Toolkit.getDefaultToolkit();
	image=toolkit.getImage("flower.jpg");
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
		TestYourKnowledge3 i = new TestYourKnowledge3();
		i.setTitle("Image Demo");
		i.setSize(300,300);
		i.setVisible(true);
	}
}
