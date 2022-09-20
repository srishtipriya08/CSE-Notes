import java.io.*;

public class Ques12
{
 public static void main(String args[]) throws IOException
  {
 
      DataOutputStream out=new DataOutputStream(new FileOutputStream("Test.txt"));
	int items= 20;   
                       float val=512.7; 
	out.writeInt(items);
	out.writeFloat(val);
	out.flush();    
	out.close();

}
}
