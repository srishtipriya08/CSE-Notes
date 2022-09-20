class Ques6{
public static void main(String args[]) {

try{
int ar[]={4,5,6};
System.out.println(ar[5]);
}
catch(Exception e) {
System.out.println("exception caught");
System.exit(0);
}
finally{
System.out.println("Finally");
}
}
}
