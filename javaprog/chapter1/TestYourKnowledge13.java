/* Program using the ternary operator 
*/
class TestYourKnowledge13
{
public static void main(String args[])
{
int x =3;
int y =7;
int z =0;
int res;
res = (x<y ? x : y)<z ? (x<y?x:y):z;
 		System.out.println("The minimum number is:" + res);
}
}
