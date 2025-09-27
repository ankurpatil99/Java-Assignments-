package array;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Object   rev[][]= new Object  [3][3];
		
		rev[0][0]=1;
		rev[0][1]=2;
		rev[0][2]=3;
		
		rev[1][0]=4;
		rev[1][1]=5;
		rev[1][2]=6;
		
		rev[2][0]=7;
		rev[2][1]=8;
		rev[2][2]=9;
		
		for(int i=2;i>=rev.length-1;i--)
		{
			for(int j=2;j>=rev[2].length;j--)
			{
				System.out.print(rev[i][j]);
			}
			System.out.println("\n");
		}
		
		
	}

}
