import kogent.*;
class MultiImportDemo
{
	public static void main(String args[])
	{
		int m[]={8,5,7,6,9};
		kogent.PackageDemo obj = new kogent.PackageDemo(m);
                kogent.PackageDemo1 obj1 = new kogent.PackageDemo1();
                obj.arr();
                obj1.area(5,6);
         }
}
