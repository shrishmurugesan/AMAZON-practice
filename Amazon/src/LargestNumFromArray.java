
import java.util.Arrays;
import java.util.Comparator;

public class LargestNumFromArray {
	public static String largestNumber(int[] nums) {
		
	    String[] arr = new String[nums.length];
	    for(int i=0; i<nums.length; i++){
	        arr[i]=String.valueOf(nums[i]);
	    }
	    
//
	    Comparator<String> compare = new Comparator<String>()
	    		{
	    			public int compare(String a, String b)
	    			{
	    				return (b+a).compareTo(a+b);
	    			}
	    		};
	    		
	    Arrays.sort(arr, compare); 
	    
	 
	    StringBuilder sb = new StringBuilder();
	    for(String s: arr){
	        sb.append(s);
	    }
	 
	    while(sb.charAt(0)=='0'&&sb.length()>1)
	        sb.deleteCharAt(0);
	 
	    return sb.toString();
	}
	
	public static void main(String a[])
	{
		int[] array = {12,45,67,23,3,9,45,8};
		
		String output = largestNumber(array);
		
		System.out.println(output);
	}
}

class CustomString implements Comparator<CustomString>
{
	
	public String a;

	@Override
	public int compare(CustomString a, CustomString b) {
		
		return (a.a+b.a).compareTo(b.a+a.a);
	}
	
	public void set(String a)
	{
		this.a = a;
	}
	
}
