public class Test12 {
	public static void main(String args[]) {
		String org = "this";
		String search = "is";
		String sub = "was";
		String result = "";
		int i=org.length();
		for(int j=0;j<i;j++) {
			result = org.substring(0, j);
			result = result + sub;
			result = result + org.substring(j + search.length());
			org = result;
		}
	System.out.println(org);
}}
