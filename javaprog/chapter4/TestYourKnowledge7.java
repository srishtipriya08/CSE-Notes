import java.io.*;
class TestYourKnowledge7 {
 	public static void main(String args [])throws IOException 	{
 		BufferedReader in= new BufferedReader(new 
 			InputStreamReader(System.in));
 		int NO=1;
 		try {
 			System.out.println("ENTER THE NUMBER");
 			NO=Integer.parseInt(in.readLine());
 		}
 		catch(NumberFormatException e)
 		{
 		}
 		int R,SUM=0,F=1;
 		do {
 			R=NO%2;
 			SUM+=R*F;
 			NO=NO/2;
 			F*=10;
 		}
 		while(NO>0);
 		System.out.println("BINARY CONVERSION = "+SUM);
 	}
}
