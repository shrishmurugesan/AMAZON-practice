import java.util.*;

public class SumPresentInArray {

	public static void main(String a[])
	{
	int[] arr = {1,2,3,4,5,6,7,8,9,10};
	
	HashSet<Integer> arrHash = new HashSet<>();
	
	for (Integer integer : arr) {
		arrHash.add(integer);
	}
	
	for(int i=0; i<arr.length-1;i++)
	{
		
		for(int j=i+1; j < arr.length;j++)
		{
			int sum = arr[i] + arr[j];
			
			if(arrHash.contains(sum))
			{
				System.out.println("The array contains the sum of "+arr[i]+" and "+arr[j]+" which is "+sum);
			}
		}
		
	}
	
	
	}
	
	
}
