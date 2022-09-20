import java.io.*;
public class TestYourKnowledge15{
 	public static void main(String args[]) {
 		try {
			FileInputStream f;
  		f = new FileInputStream("Test1.txt");
 			boolean eof = false;
 			int count = 0;
 			while (!eof) 
 			{
 				int i = f.read();
 				System.out.print(i + " ");
 				if (i == -1)
 				eof = true;
 				else
 					count++;
 			}
 			f.close();
 			System.out.println("\n Total number of bytes read from the file are: " 	+count);
 		} catch (Exception e) {
  		System.out.println(e);
 		}
 	}
}
