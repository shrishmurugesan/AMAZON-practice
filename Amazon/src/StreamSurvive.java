import java.util.*;

public class StreamSurvive {
	
	public static void main(String a[])
	{
		ArrayList<Integer> stream = new ArrayList<>();
		
		//generate a stream from 1 - 1111
		
		for(int i=1;i<=1111;i++)
		{
			stream.add(i);
		}
		
		//Array J to specify deletion intervals
		
		int[] j = {2,3,4};
		
		//specify a number n to check if it survives..or print the index at which it dies
		
		int n = 9;
		
		survive(stream,j,n);
		

		
		
	}
	
	static void survive(ArrayList<Integer> stream, int[] j, int n)
	{
		int currentIndex = 0;
		int interval = 0;
		boolean doesSurvive = true;
		
		while(currentIndex<j.length)
		{
			interval = j[currentIndex];
			
			
			for(int i=0;i<stream.size();i+=interval)
			{
				stream.remove(i);
				
			}
			
			for(int i = 0; i< 15; i++)
			{
				System.out.print(stream.get(i)+" ");
			}
			
			System.out.println();
			
			if(stream.contains(n))
			{
				currentIndex++;
				continue;
			}
			else
			{
				
				doesSurvive = false;
				System.out.println("The value "+n+" dies at operation index "+currentIndex);
				currentIndex++;
				break;
			}
			
			
			
		}
		
		if(doesSurvive)
		{
			System.out.println("the value "+n+" survives all the operations");
		}
	}

}
