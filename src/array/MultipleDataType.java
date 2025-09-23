package array;

public class MultipleDataType {

	

			public static void main(String[] args) {
				// TODO Auto-generated method stub
					
				//Here we created the array of Object type which can store the any type data
					Object obj[]= new Object[8];
					obj[0]='A';
					obj[1]="Ankur";
					obj[2]=1;
					obj[3]=12.12;
					obj[4]=12344.123434555433;
					obj[5]=true;
					obj[6]=1234;
					
					//we printted the data using the Adavanced for loop
					for(Object o:obj)
					{
						System.out.println("Object is storing the Data "+o);
					}
			
	}

}
