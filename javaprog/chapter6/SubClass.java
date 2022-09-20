package kogent;

class SubClass extends SupClass
{

   public SubClass()
   {
        System.out.println("Constructor of Subclass");
        System.out.println("Default Number :"+defaultnum);
        //System.out.println("Private Number :"+privatenum);
        System.out.println("Protected Number :"+protectednum);
        System.out.println("Public :"+publicnum);
}
}

