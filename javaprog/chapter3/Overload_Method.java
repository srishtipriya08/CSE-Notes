 
class Overload_Method { 
void load() { 
System.out.println("Method without any arguement"); 
} 


void load(int x, int y) { 
System.out.println("Method with two integer arguements " + x + " " + y); 

} 


void load(double x, double y) { 
System.out.println("Method with two double arguements " + x + " " + y); 

} 
 
public static void main(String args[]) 
{ 
  Overload_Method om = new Overload_Method(); 
double x=5.0, y=4.0;
om.load(); 
om.load(x,y); 
om.load(2.5, 7.5); 

 
} 
}
