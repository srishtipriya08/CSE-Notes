import java.lang.System;

class TestYourKnowledge14{
 	public static void main(String args[])
 	{
 		int I,N,KI,TEMP,LOC,BIG;
 		int A[]={52,59,69,86,74,38,91};
 		N=A.length;
 		Float SUM=0.0f;
 		for (I=0;I<=N-1;I++)
 		SUM+=A[I];
 		float MEAN=(float) SUM/N;
 		float sigma=0;
 		for (I=0;I<=N-1;I++)
 		sigma+=(MEAN-A[I])*(MEAN-A[I]);
 		System.out.print("STD.DEV. ="+(sigma/N));
 	}
}
