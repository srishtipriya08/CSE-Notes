package kogent;

class ClassDemo
{

   ClassDemo()
   {
      SupClass obj=new SupClass();
      System.out.println("Constructor in the same package");
      System.out.println("Default Number :"+obj.defaultnum);
      //System.out.println("Private Number :"+privatenum);
      System.out.println("Protected :"+obj.protectednum);
      System.out.println("Publice Number :"+obj.publicnum);
}
}

