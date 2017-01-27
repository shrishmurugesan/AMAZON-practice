import java.util.*;
public class arraysum {
	
	public static void main(String a[]) throws ArrayIndexOutOfBoundsException
	{
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		HashSet<Integer> hset = new HashSet<>();
		ArrayList<Integer> alist = new ArrayList<>();
		
		
		
		for (int i : arr) {
			hset.add(i);
		}
		try{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i;j<arr.length;j++)
			{
				int temp = arr[i]+arr[j];
				if(hset.contains(temp))
					System.out.println("The Numbers "+arr[i]+" and "+arr[j]+" have their sum "+temp+" present in the array");
			}
			
		}
	}catch(Exception e)
		{
		System.out.println(e);
		}
	}
}
