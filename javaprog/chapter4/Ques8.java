class Ques8
{
   public static void main(String args[])
   {
        DataInputStream obj=new DataInputStream(System.in);
         char ch=' ';
            try
          {
             System.out.println("Enter  'Q' to quit");
              
	while(ch!='Q')
	{
                              ch=(char)obj.read();
                          System.out.println(ch);

                          }
                  }

   catch(Exception ex)
    {
         System.out.println(ex);

}
}
}
