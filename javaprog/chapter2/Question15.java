import java.lang.Math;
class Question15
{
public static void main(String args[])
{
int I,K,J,T;
for(I=1;I<=40;I++)
for(J=I;J<=40;J++)
{
T=I*I+J*J;
K=(int)Math.sqrt(T);
if(K*K==T)
System.out.print(I+J+K + " ");
}
}
}
