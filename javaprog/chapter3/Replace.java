public class Replace{
	public static void main(String args[]) {
		String str = "Hello Java Hello"; 
		System.out.println(str.replace('H', ' '));
		System.out.println(str.replaceAll("Hello", "Hi"));
		System.out.println(str.replaceFirst("Hello", "Hi"));
		
	}
}
