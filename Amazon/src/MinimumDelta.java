import java.util.Arrays;

public class MinimumDelta {
	
	public static void main(String a[])
	{
	  
		int[] arr1 = {98,4,999};
		int[] arr2 = {-1,2,3};
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int minDelta = findMinDelta(arr1,arr2);
		System.out.println("The minimum delta is :"+minDelta);
		
	}

	public static int findMinDelta(int[] arr1, int[] arr2) {
		
		int low = 0;
		int high = arr2.length-1;
		int minDelta = Integer.MAX_VALUE;
		
		for (int i : arr1) 
		{
			if(i <= arr2[low])
			{
				if(Math.abs(i - arr2[low])<minDelta)
				{
					minDelta = Math.abs(i-arr2[low]);
				}
			}  
			
			else if(i >= arr2[high])
			{
				if(Math.abs(i - arr2[high]) < minDelta)
				{
					minDelta = Math.abs(i - arr2[high]);
				}
			}
			else
			{
				for(int j = low;i<=high;i++)
				{
					int temp = Math.abs(i - arr2[j]);
					if(temp < minDelta)
					{
						minDelta = temp;
					}
				}
			}
			
			
		}
		return minDelta;
	}

}
