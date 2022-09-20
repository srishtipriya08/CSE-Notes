class ArrayExample3
{
  
  public void display()
   {
	
     System.out.println (" Array of Objects ");
   }



public static void main (String args[])
   {
	ArrayExample3 a_obj[ ]=new ArrayExample3[3];
         
        	a_obj[0]=new ArrayExample3();
        	a_obj[1]=new ArrayExample3();
        	a_obj[2]=new ArrayExample3();
		a_obj[1].display();
		
	 
         
   }
}