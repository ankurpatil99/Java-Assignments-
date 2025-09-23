package array;

public class ArrayPatternTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
Object obj[][]=new Object[3][3];
		
		obj[0][0]='A';
		obj[0][1]='b';
		obj[0][2]='c';
		
		obj[1][0]='d';
		obj[1][1]='e';
		obj[1][2]='f';
		
		obj[2][0]='g';
		obj[2][1]='h';
		obj[2][2]='i';
		
		//Printing the array in table Format
		for(int row=0; row < obj.length; row++)
		{
			for(int col=0; col < obj[row].length; col++)
			{
				System.out.print(obj[row][col]+"\t");
				 
			}
			System.out.println();
		}
	}

}
