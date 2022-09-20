// To verify the array whether it is arranged in decreasing order or not//
class TestYourKnowledge11
{
 	static boolean order(int n,int a[])
 	{
 		boolean flag1=true, flag=true ;
 		for(int i=0;i<=n-2;i++)
 		{
 			if(a[i]<a[i+1]) flag1=false;
 		}
 		return(flag1);
 	}
 	public static void main(String args[])
 	{
 		int n=5;
 		int a[]={75,65,55,45,35};
 		if (order(n,a))// when flag1=true;
 		System.out.println("Array is arranged in order");
 		else
 		System.out.println("Array is not arranged in order");
 	}
}
