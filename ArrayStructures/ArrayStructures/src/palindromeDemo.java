import java.util.*;


public class palindromeDemo {
	private static int $ ;
	public static void main(String a[])
	{
		LinkedList<Integer> test = new LinkedList<Integer>();
		
		test.add(5);
		test.add(6);
		test.add(7);
		String ass="";
		System.out.println($);
		System.out.println(ass);
		int displayArray[] = new int[test.size()];
		
		for(int i=0; i < test.size(); i++)
		{
			displayArray[i] = test.get(i);
		}
		
		for(int j= 0 ; j<displayArray.length;j++)
		{
			System.out.print(displayArray[j]+"-->");
		}
		
	}

}
