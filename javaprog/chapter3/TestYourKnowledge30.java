class TestYourKnowledge30
{
 	public static void main(String args[])
 	{
 		String str[]={"Hi", "Hello", "Java", "good"};
 		String temp;
 		for(int x=0; x<str.length; x++)
 		{
 			for(int y=x+1; y<str.length; y++)
 			{
 				if(str[y].compareToIgnoreCase(str[x])<0)
 				{
					temp = str[x];
					str[x] =str[y];
					str[y] = temp;
 				}
 			}
 		}
 		for(int k=0; k<str.length;k++)
 		{
 			System.out.print(str[k]);
 		}
 	}
}
