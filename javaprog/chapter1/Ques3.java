class Ques3{
	
	public static void main(String args[]) {
	boolean x = false;
	boolean y = true;
	boolean z = true; 
 	boolean a = (x = true) || (y = true) && (z = true); 
 	System.out.println(x + ", " + y +", " 	+z);
	}
}
