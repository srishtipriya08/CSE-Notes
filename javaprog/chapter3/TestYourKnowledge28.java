class TestYourKnowledge28 { 
public static void main(String args[]) 
{ 
 	String s="radar";
 	int c=s.length();
 	boolean flag=false;
 	for(int x=0,y=c-1; x<c/2; x++, y--)
 	{
 		if(s.charAt(x)==s.charAt(y))
 		{
 			flag=true;
 		}
 		else
 		{
 			flag=false;
 		}
 	}
 	if(flag==true)
 	{
 		System.out.println(" The string " + s + " is a palindrome");
 	}
 	else
 	{
 		System.out.println(" The string " + s + "is a not a palindrome");
 	}
} 
}
