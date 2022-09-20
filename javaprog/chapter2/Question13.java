class Question13
{
public static void main(String args[])
{
int NO=25;
int R,SUM=0,F=1;
do
{
R=NO%2;
SUM+=R*F;
NO=NO/2;
F*=10;
}
while(NO!=0);
System.out.println("Sum="+SUM);
}
}
