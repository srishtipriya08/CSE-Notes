class TestYourKnowledge29{ 
 	public static void main(String args[]) 
 	{ 
 		StringBuffer sb=new StringBuffer("He is an intelligent boy");
 
 		for(int x=0; x<sb.length(); x++)
 		{
 		if(sb.charAt(x)== 'a' && sb.charAt(x+1) == 'n' && sb.charAt(x+2)== 32)
 		{
 			sb.replace(x, x+2, "the");
 		}
 		} 
 		System.out.println("String after replacement is: " + sb);
 	}
}
