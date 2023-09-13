package work;

public class Arrayprograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[]= {1,2,3,4,5,6,7,8,9,10};
		 System.out.println("Iterating over the array");
         for(int i=0;i<arr.length;i++)
         {
        	System.out.print(arr[i]+" ");
         }
 		System.out.println("\nFirst element : " + arr[0]);
 		System.out.println("Last element : "+ arr[9] + "\n");
 		
 		arr[2] = 6;
		arr[7] = 2;
		
		System.out.println("Array after updating the 3rd and 8th element:");
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+ " ");
		}
	}

}
