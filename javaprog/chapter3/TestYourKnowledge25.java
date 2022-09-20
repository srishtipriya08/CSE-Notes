import java.util.*;
class TestYourKnowledge25
{
 	public static void main(String args[])
 	{
 		Vector vect=new Vector(5,3);
 		vect.addElement(new Integer(254));
		vect.addElement(new Double(214.25));
		vect.addElement(new Integer(142));
		vect.addElement(new Boolean(false));
		vect.addElement(new Integer(4));
		Enumeration e= vect.elements();
		System.out.println("Element objects present in this vector are : "  );
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		System.out.println("Size of the dynamic array is: " + vect.size());
	}
}
