public class Test2
{
public static void main(String args[]) 
{
 int x[][]={{3,9},{2,5},{4,4}};
 for(int k=0; k<x.length; k++)
  {
    for(int j=0; j<x.length-1; j++)
     {
       System.out.println(x[k][j]+2);  
     }
  }
}
}
