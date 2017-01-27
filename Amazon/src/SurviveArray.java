import java.util.*;

public class SurviveArray {
	
	public static void main(String a[])
	{
		//generate stream of numbers from 1 - 1111
		ArrayList<Integer> stream = new ArrayList<>();
		
		for(int i=1; i<=1111;i++)
		{
			stream.add(i);
		}
		
		int[] j = {2,3,4};
		
		willSurvive(stream, j , 98);
		System.out.println();
		
	}

	public static int willSurvive(ArrayList<Integer> stream, int[] elimInterval, int i) {
		for (int k =0; k<elimInterval.length;k++) 
		{
			int interval = elimInterval[k];
			for(int j=interval-1;j<stream.size();j+=interval)
			{
				stream.remove(j);
				stream.add(j, -1);
			}
			
			for(int j=0;j<stream.size();j++)
			{
				if(stream.get(j)== -1)
				{
					stream.remove(j);
				}
			}
			
			if(stream.contains(i))
			{
				continue;
			}
			else
			{
				System.out.println("The value "+i+" Dies at index "+k);
				return k;
			}
		}
		
		System.out.println("The value "+i+" Survives all the operations");
		return -1;
	}

}
