class TestYourKnowledge31
{
 	public static void main(String args[])
 	{
 		String str="Today, environment is cool";
 		String str1=new String();
 		int c=0;
 		str1=str.toUpperCase();           
 		System.out.println(str1);
 		for(int x=0;x<str1.length(); x++)
 		{
 			if(str1.charAt(x)==32)
 			{
 				c++;
 			}    
 		}
 	System.out.println("Total numbers of spaces in string str1 are: " + c);
 	}
}
