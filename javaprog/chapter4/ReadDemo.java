import java.io.*;

class ReadCharDemo
{
   public static void main(String args[])
   {
        DataInputStream obj=new DataInputStream(System.in);
         char ch;
            try

          {
             System.out.println("Enter  'Q' to exit");
              
	while(ch!='Q')
	{
                              ch=(char)in.read();
                          System.out.println(ch);

                          }

	
	//do
             //   {
	//ch=(char)in.read();
                          System.out.println(ch);
	}while(ch!='Q');

                  }

   catch(Exception ex)
    {
         System.out.println("I/O error");

}


}




}