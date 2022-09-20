import java.io.*;
class TestYourKnowledge9
{
 	public static void main(String args [])throws IOException {
 		BufferedReader in= new BufferedReader(new InputStreamReader 
 			(System.in));
 		int no=1;
 		try {
 			System.out.println("ENTER THE NUMBER");
 			no=Integer.parseInt(in.readLine());
 		}
 		catch(NumberFormatException e)
 		{
 		}
 		int SUM=0,D;
 		do {
 			D=no%10;
 			SUM+=D;
 			no=no/10;
 		}
 		while(no != 0);
 		System.out.println("SUM="+SUM);
 	}
}
