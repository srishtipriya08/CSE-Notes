import java.awt.*;
import java.awt.event.*;

class CardLayoutDemo extends Frame
{
int current = 1;
Panel cp;
CardLayout c;
CardLayoutDemo()
{
setTitle("Card Layout Demo");
setSize(300,150);

cp = new Panel();
c = new CardLayout();

cp.setLayout(c);

Panel p1 = new Panel();
Panel p2 = new Panel();
Panel p3 = new Panel();
Panel p4 = new Panel();

Label l1 = new Label("Card1");
Label l2 = new Label("Card2");
Label l3 = new Label("Card3");
Label l4 = new Label("Card4");

p1.add(l1);
p2.add(l2);
p3.add(l3);
p4.add(l4);

cp.add(p1,"1");
cp.add(p2,"2");
cp.add(p3,"3");
cp.add(p4,"4");

Panel button = new Panel();
Button b1 = new Button("First Card");
Button b2 = new Button("Next Card");
Button b3 = new Button("Previous Card");
Button b4 = new Button("Last Card");

button.add(b1);
button.add(b2);
button.add(b3);
button.add(b4);

b1.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent ae){
c.first(cp);
current =1;
}
});


b4.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent ae){
c.last(cp);
current =4;
}
});

b2.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent ae){
c.next(cp);
}
});

b3.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent ae){
c.previous(cp);
}
});

addWindowListener(new WindowAdapter() 
{
public void windowClosing (WindowEvent e)
{
System.exit (0);
}
});

add(cp, BorderLayout.NORTH);
add(button, BorderLayout.SOUTH);

}

public static void main(String args[])
{
CardLayoutDemo cle = new CardLayoutDemo();
cle.setVisible(true);
}
}