package array;

public class SimpleMultiDimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int b[][]=new int[2][2];

		b[0][0]=56;
		b[0][1]=78;

		b[1][0]=89;
		b[1][1]=12;
		
		for(int i=0;i<b.length;i++)  
		{
		for(int j=0;j<b[i].length;j++)
		{
				System.out.println(b[i][j]);
	}

}
	}
}
