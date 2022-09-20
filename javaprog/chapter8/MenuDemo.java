import java.awt.*;
import java.awt.event.*;
import java.awt.datatransfer.*;
import java.io.*;

class MenuDemo extends Frame
{
	String msg=" ";
	CheckboxMenuItem i13,i14;
	TextArea text;

	MenuDemo()
	{
	MenuBar mbar=new MenuBar();

	text=new TextArea(400,200);
	add(text);
	text.setEditable(true);
	Menu file=new Menu("File");
	MenuItem i1,i2,i3,i4,i5;
	file.add(i1=new MenuItem("New..."));
	file.add(i2=new MenuItem("Open..."));
	file.add(i3=new MenuItem("Save..."));
	file.add(i4=new MenuItem("-"));
	file.add(i5=new MenuItem("Quit..."));
	mbar.add(file);

	Menu edit=new Menu("Edit");
	MenuItem i6,i7,i8,i9,sep;
	edit.add(i6=new MenuItem("Cut"));
	edit.add(i7=new MenuItem("Copy"));
	edit.add(i8=new MenuItem("Paste"));
	edit.add(i9=new MenuItem("-"));
	Menu sub=new Menu("Align");

	MenuItem i10,i11,i12;
	sub.add(i10=new MenuItem("Left"));
	sub.add(i11=new MenuItem("Right"));
	sub.add(i12=new MenuItem("Center"));
	edit.add(sub);
	edit.add(sep=new MenuItem("-"));

	i13=new CheckboxMenuItem("VerticalScrollBar");
	edit.add(i13);
	i14=new CheckboxMenuItem("HorizontalScrollBar");
	edit.add(i14);
	mbar.add(edit);

	Mymenuhandler handler=new Mymenuhandler(this);
	i1.addActionListener(handler);
	i2.addActionListener(handler);
	i3.addActionListener(handler);
	i4.addActionListener(handler);
	i5.addActionListener(handler);
	i6.addActionListener(handler);
	i7.addActionListener(handler);
	i8.addActionListener(handler);
	i9.addActionListener(handler);
	i10.addActionListener(handler);
	i11.addActionListener(handler);
	i12.addActionListener(handler);
	i13.addItemListener(handler);
	i14.addItemListener(handler);

	MyWindowAdapter adapter=new MyWindowAdapter(this);

	addWindowListener(adapter);
	setMenuBar(mbar);
	}

	public void paint(Graphics g)
	{
	}
	public static void main(String args[])
	{
		MenuDemo cle = new MenuDemo();
		cle.setVisible(true);
		cle.setTitle("Menu Demo");
		cle.setSize(200,200);
	}
}

	class MyWindowAdapter extends WindowAdapter
	{
	MenuDemo md;
	public MyWindowAdapter(MenuDemo md)
	{
		this.md=md;
	}

	public void windowClosing(WindowEvent we)
	{
		System.exit(0);
	}

	}

	class Mymenuhandler implements ActionListener,ItemListener
	{
		MenuDemo mdemo;
		FileDialog fd;
		String pm="you selected : ",msg=" ";
		String filename;
		public Mymenuhandler(MenuDemo mdemo)
	{
		this.mdemo=mdemo;
	}

	public void actionPerformed(ActionEvent ae)
	{
	String arg=(String)ae.getActionCommand();
	if(arg.equals("New..."))
	msg=pm+"new";
	else if(arg.equals("Open..."))
	msg=pm+"Open";
	else if(arg.equals("Save..."))
	msg=pm+"save";
	else if(arg.equals("Quit..."))
	msg=pm+"quit";
	else if(arg.equals("Edit"))
	msg=pm+"Edit";
	else if(arg.equals("Cut"))
	msg=pm+"Cut";
	else if(arg.equals("Copy"))
	msg=pm+"Copy";
	else if(arg.equals("Paste"))
	msg=pm+"Paste";
	else if(arg.equals("Left"))
	msg=pm+"Left";
	else if(arg.equals("Right"))
	msg=pm+"Right";
	else if(arg.equals("Center"))
	msg=pm+"Center";
	else if(arg.equals("VerticalScrollBar"))
	msg=pm+"Vertical Scroll Bar";
	else if(arg.equals("HorizontalScrollBar"))
	msg=pm+"Horizontal Scroll Bar";
	
	mdemo.text.setText(msg);
	mdemo.repaint();
	}

	public void itemStateChanged(ItemEvent ie)
	{
	mdemo.repaint();
	}
}