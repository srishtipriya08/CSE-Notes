import java.io.*;
public class TestYourKnowledge16
{
public static void main(String args[]) throws IOException
{
 		DataOutputStream out=new DataOutputStream(new FileOutputStream  		 	("MyFile.txt"));
		int articles= 10;   
		float price=8.16F; 
		out.writeInt(articles);
		out.writeFloat(price);
		out.flush();    
		out.close();
}
}
