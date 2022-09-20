import java.io.*;
public class Ques11{
	public static void main(String args[]) {
        try {

                   FileInputStream f= new FileInputStream("Test1.txt");
                  boolean eof = false;
                   int count = 0;

	while (!eof) 
	{
	    int i = f.read();
	//System.out.print(i + " ");
                    DataOutputStream out=new DataOutputStream(new FileOutputStream("Test2.txt"));
                    out.writeInt(i);
                         if (i == -1)
	eof = true;
	else
	count++;
	}
     
               f.close();
                  }
              catch (Exception e) {
			System.out.println(e);
		}
}
}








                   
                                                                       
			
                                                                           


