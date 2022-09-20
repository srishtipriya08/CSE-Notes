public class HashCodeDemo
{
    public static void main(String[] args)
    {
        HashCodeDemo obj = new HashCodeDemo();
        int hashcode = obj.hashCode();
        System.out.println("The hash code of obj is " +hashcode);
    }
}
