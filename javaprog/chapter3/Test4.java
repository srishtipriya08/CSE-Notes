import java.util.*;

class Test4 {
public static void main(String args[]) 
{
Vector vect = new Vector(2,5);
System.out.println(vect.size());
vect.addElement(new Boolean(false));
vect.addElement(new Integer(10));
vect.addElement(new Double(5.84));
System.out.println(vect.capacity());
System.out.println((Boolean)vect.firstElement());

}
}
