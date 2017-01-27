import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
	
	static int binSearch(int[] stream, int key)
	{
		int low = 0;
		int high = stream.length - 1; //-1 since its an index
		
		int resultAt = binSearch(stream,key,low,high);
		
		return resultAt;
		
		
	}

	private static int binSearch(int[] stream, int key, int low, int high) {
		int mid =  (high + low) /2;
		
		if(stream[mid] == key)
			return mid;
		else
		{
			int resultAt = 0;
			
			if(key > stream[mid])
			{
				resultAt = binSearch(stream, key, mid+1,high);
				return resultAt;
			}
			else
			{
				resultAt = binSearch(stream, key, low, mid-1);
				return resultAt;
			}
		}
	}
	
	public static void main(String a[])
	{
		Scanner sc = new Scanner(System.in);
		int[] stream = {29,41,63,42,77,84,25,85,86,47,89,91,23};
		Arrays.sort(stream);
		for (int i : stream) {
			System.out.print(i+" ");
		}
		
		System.out.println("\nEnter the element which you wish to find");
		int key = sc.nextInt();
		System.out.println("The element is found at index: "+binSearch(stream,key));
	}
}
