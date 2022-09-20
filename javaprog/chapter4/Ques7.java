class Ques7 {
public static void main(String args[]) {
String s[]={"a","b","c"};
try{
int k=1/0;
System.out.println(s[2]);
s[3]="d";
System.out.println(s[3]);
}
catch(ArrayIndexOutOfBoundsException r) {
System.out.println("caught");
}
}
}
