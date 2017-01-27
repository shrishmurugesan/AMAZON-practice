import java.util.*;

public class SumOfPairsPresentInArray {
	
	public static void main(String a[])
	{
		HashSet<Integer> hmap = new HashSet<>();
		int[] array = {1,2,3,4,5,6,7,8,9,10};
		for (int i : array) {
			hmap.add(i);
		}
		
		for(int i=0;i<array.length-1;i++)
		{
			for(int j=1;j<array.length;j++)
			{
				if(hmap.contains(array[i]+array[j]))
				{
					System.out.println("The sum of "+array[i]+" and "+array[j]+" which is "+(array[i]+array[j])+" is present in the array");
				}
			}
		}
	}

}
