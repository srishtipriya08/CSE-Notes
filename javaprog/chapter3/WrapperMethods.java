public class WrapperMethods {
	public static void main(String str[]) {
		// Using the valueOf() method with single arguement
		Integer n = Integer.valueOf("36");
		System.out.println (" Value of Integer object n is " + n); 

		// Using the valueOf() method with two arguement
		Integer n1 = Integer.valueOf("36",8);
		System.out.println (" Octal representation of object n1 is " + n1); 

		// Using the XxxValue() method 
		Integer n2= new Integer(56);
		double d= n2.doubleValue();
		System.out.println (" Primitive representation of object n2 is " + d); 

		// Using the parseXxx() method 
		float f= Float.parseFloat("25");
		System.out.println (" Primitive representation of String 25 is " + f); 

		// Using the toString() method 
		String d1 = Double.toString(7.22); 
		System.out.println(" The string value is : "+ d1);

		// Using the toXxxString() method
		String s1 = Integer.toBinaryString(65); 
		System.out.println(" String value of s1 in binary system : "+s1);


	}
}
