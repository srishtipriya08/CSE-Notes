class Question16
{
public static void main(String args [])
{
int I;
for (I=100;I<=9999;I++)
{
int NO=I,SUM=0,d;
do
{
d=NO%10;
SUM=SUM+d*d*d;
NO=NO/10;
}
while(NO>0);
if (SUM==I)
System.out.print(I + " ");
}
}
}
