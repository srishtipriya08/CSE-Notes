package kogent;

 public class SupClass
 {
   int defaultnum=5;
   private int privatenum=10;
   protected int protectednum=15;
   public int publicnum=20;

   public SupClass()
   {
        System.out.println("Simple Constructor");
        System.out.println("Default Number :"+defaultnum);
        System.out.println("Private Number :"+privatenum);
        System.out.println("Protected Number :"+protectednum);
        System.out.println("Public Number :"+publicnum);
   }
}

