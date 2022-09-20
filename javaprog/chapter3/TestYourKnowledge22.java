class TestYourKnowledge22
{
	public static void main(String args [])
 	{
 		int I,J;
 		int A[][]={{8,12,13},{17,21,36},{49,56,63},{72,81,89}};
 		int B[][]={{10,17,14},{36,49,17},{11,18,24},{24,28,32}};
 		int C[][]=new int [4] [3];
 		for(I=0; I<=3; I++)
 		for(J=0; J<=2; J++)
 		C[I][J]=A[I][J]+B[I][J];
		for(I=0; I<=3;I++)
 		{
 			System.out.println("  ");
 			for(J=0; J<=2; J++)
 			System.out.print(" " +C[I][J]);
		}
	}
}
