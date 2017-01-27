import java.util.Arrays;
import java.util.*;

public class LargestInArrayIntegerComparator {

	
	public static void main(String a[])
	{
		int[] array = { 10,  15 , 6, 89, 45};
		
		
		String[] comparableArray = new String[array.length];
		
		for(int i=0;i<array.length;i++)
		{
			comparableArray[i] = String.valueOf(array[i]);
		}
		
		Arrays.sort(comparableArray, new Comparator<String>()
				{

					
					public int compare(String a, String b) {
						// TODO Auto-generated method stub
						return (a+b).compareTo(b+a);
					}
					
				});
		
		for (String string : comparableArray) {
			System.out.print(string);
		}
		
	}
}
