import java.awt.*; 
import java.awt.event.*; 
 
public class MenuDemo extends Frame 
{ 
  public MainWindow() 
{ 
    super("Menu Window"); 
    setSize(400, 400); 
    FileMenu fileMenu = new FileMenu(this); 
    MenuBar mb = new MenuBar(); 
    mb.add(fileMenu); 
    setMenuBar(mb); 
    addWindowListener(new WindowAdapter() { 
      public void windowClosing(WindowEvent e) { 
	 System.exit (0);
      } 
    }); 
  } 
 
  public static void main(String args[]) { 
    MainWindow w = new MainWindow(); 
    w.setVisible(true); 
  } 
} 
 
class FileMenu extends Menu implements ActionListener { 
  MainWindow mw;  
  public FileMenu(MainWindow m) { 
    super("File"); 
    mw = m; 
    MenuItem mi; 
    add(mi = new MenuItem("Open")); 
    mi.addActionListener(this); 
    add(mi = new MenuItem("Close")); 
    mi.addActionListener(this); 
    add(mi = new MenuItem("Exit")); 
    mi.addActionListener(this); 
  } 
 
  public void actionPerformed(ActionEvent e) { 
    String item = e.getActionCommand(); 
    if (item.equals("Exit"))  
	 System.exit (0);
  } 
} 
 
 