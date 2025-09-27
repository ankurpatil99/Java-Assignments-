package array;

public class LargesElementInArrya {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {11,2,3333,1,55,66,444};
		
		int largest=arr[0]; //largest[11]
		int smallest=arr[0];//smallest[]11
		
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]>largest) // checking the condition with for loop if it is largest num it will asign to array
			{
				largest=arr[i];
			}
			else if(arr[i]<smallest)
			{
				smallest=arr[i];
			}
			
		}
		System.out.println("largest No "+largest);
		System.out.println("Smallest no "+smallest);
	}

}

 
 