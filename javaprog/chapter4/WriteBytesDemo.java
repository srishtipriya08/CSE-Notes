import java.io.*;


public class WriteBytesDemo
{
 public static void main(String args[]) throws IOException
  {
 
	   DataOutputStream out = new DataOutputStream(new FileOutputStream("TestFile.txt"));
		int unit= 10;   
                                               float price=5.16F; 
		out.writeInt(unit);
		out.writeFloat(price);
		out.flush();    
		out.close();

}
}